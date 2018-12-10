package com.example.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.domain.ClanM;
import com.example.app.repository.ClanMRepository;

@Service
@Transactional
public class ClanMService {
	@Autowired
	ClanMRepository clanMRepository;
	public List<ClanM> getData(){
		return clanMRepository.findAll();	
	}

}
