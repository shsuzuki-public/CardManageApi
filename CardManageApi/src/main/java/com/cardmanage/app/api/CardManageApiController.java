package com.cardmanage.app.api;

import java.util.List;

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
	@Autowired
	ClanMService clanMService;

	@RequestMapping(value="/clans", method=RequestMethod.GET)
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
}
