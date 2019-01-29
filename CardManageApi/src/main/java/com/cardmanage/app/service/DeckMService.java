package com.cardmanage.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cardmanage.app.domain.DeckM;
import com.cardmanage.app.repository.DeckMRepository;

@Service
@Transactional
public class DeckMService {
	@Autowired
	DeckMRepository deckMRepository;
	
	public List<DeckM> getAllDeckList(){
		//return deckMRepository.findAll();
		return deckMRepository.findAll(new Sort(Sort.Direction.ASC, "deckId"));
	}
	
	public Optional<DeckM> getDeck(Integer deckId){
		return deckMRepository.findDeckFromId(deckId);
	}

}
