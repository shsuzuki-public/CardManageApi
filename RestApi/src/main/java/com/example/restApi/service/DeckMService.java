package com.example.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.domain.DeckM;
import com.example.app.repository.DeckMRepository;

@Service
@Transactional
public class DeckMService {
	@Autowired
	DeckMRepository deckMRepository;
	
	public List<DeckM> getData(){
		return deckMRepository.findAll();
	}

}
