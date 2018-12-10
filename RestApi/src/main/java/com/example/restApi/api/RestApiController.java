package com.example.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.domain.ClanM;
import com.example.app.domain.DeckM;
import com.example.app.service.ClanMService;
import com.example.app.service.DeckMService;

@RestController
public class RestApiController {
	@Autowired
	DeckMService deckMService;
	
	@RequestMapping(value="/decks", method=RequestMethod.GET)
	public List<DeckM> deckList(){
		return deckMService.getData();
		
	}
	
	@Autowired
	ClanMService clanMService;
	
	@RequestMapping(value="/clans", method=RequestMethod.GET)
	public List<ClanM> clanList(){
		return clanMService.getData();
	}

}
