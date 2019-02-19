package com.cardmanage.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardmanage.app.domain.ClanM;
import com.cardmanage.app.repository.ClanMRepository;

@Service
@Transactional
public class ClanMService {
	@Autowired
	ClanMRepository clanMRepository;
	public List<ClanM> getAllClanList(){
		return clanMRepository.findAll();	
	}

}
