package com.cardmanage.app.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.cardmanage.app.domain.ClanM;
import com.cardmanage.app.domain.DeckM;
import com.cardmanage.app.service.ClanMService;
import com.cardmanage.app.service.DeckMService;

import lombok.val;

@RestController
public class CardManageApiController {
	@Autowired
	DeckMService deckMService;
	@Autowired
	ClanMService clanMService;

	@RequestMapping(value="/clans", method=RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<ClanM> getClanList(){
		return clanMService.getAllClanList();
	}

	@RequestMapping(value="/decks", method=RequestMethod.GET)
	public List<DeckM> getDeckList(){
		return deckMService.getAllDeckList();		
	}

	@RequestMapping(value="/decks/{clanId}", method=RequestMethod.GET)
	public List<DeckM> getDeckList(@PathVariable("clanId") Integer clanId){
		return deckMService.getTargetClanDecks(clanId);
	}

	@RequestMapping(value="/decks/deckdetail/{deckId}", method=RequestMethod.GET)
	public List<DeckM> getDeckDetailList(@PathVariable("deckId") Integer deckId){
		return deckMService.getDeckDetail(deckId);
	}

	@RequestMapping(value="/decks/deckregist", method=RequestMethod.POST)
	public ResponseEntity<DeckM> registDeck(@ModelAttribute DeckM deckM, UriComponentsBuilder uriComponentsBuilder){
		List<DeckM> deckData = new ArrayList<DeckM>();
		deckData.add(deckM);
		val headers = new HttpHeaders();
		headers.setLocation(uriComponentsBuilder.path("/decks/deckregist/{id})").buildAndExpand(deckData.size()).toUri());
		return new ResponseEntity<DeckM>(deckM, headers, HttpStatus.CREATED);
	}
	
}
