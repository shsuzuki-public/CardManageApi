package com.cardmanage.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cardmanage.domain.repository.DeckDetailRepository;
import com.cardmanage.domain.repository.DeckMRepository;
import com.cardmanage.infrastructure.entity.DeckDetailT;
import com.cardmanage.infrastructure.entity.DeckM;

@Service
@Transactional
public class DeckMService {
	@Autowired
	DeckMRepository deckMRepository;
	@Autowired
	DeckDetailRepository deckDetail;
	
	public List<DeckM> getAllDeckList(){
		return deckMRepository.findAll(new Sort(Sort.Direction.ASC, "deckId"));
	}

	public List<DeckM> getTargetClanDecks(Integer clanId){
		return deckMRepository.findDecksByClanId(clanId);
	}

/*	public List<DeckDetailT> getDeckDetail(Integer deckId){
		return deckDetail.findDeckDetailByDeckId(deckId);
	}
*/
	public DeckM createDeck(DeckM deck) {
		return deckMRepository.save(deck);
	}
}