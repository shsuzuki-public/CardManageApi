package com.cardmanage.app.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cardmanage.app.domain.ClanM;
import com.cardmanage.app.domain.DeckM;
import com.cardmanage.app.service.ClanMService;
import com.cardmanage.app.service.DeckMService;

@RestController
public class CardManageApiController {
	@Autowired
	DeckMService deckMService;
	
	@RequestMapping(value="/decks", method=RequestMethod.GET)
	public List<DeckM> getDeckList(){
		return deckMService.getAllDeckList();
		
	}
	
	@RequestMapping(value="/decks/{deckId}", method=RequestMethod.GET)
	public Optional<DeckM> getDeckList(@PathVariable("deckId") Integer deckId){
		
		return deckMService.getDeck(deckId);
	}
	
	@Autowired
	ClanMService clanMService;
	
	@RequestMapping(value="/clans", method=RequestMethod.GET)
	public List<ClanM> getClanList(){
		return clanMService.getData();
	}

}
