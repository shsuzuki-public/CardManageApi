package com.cardmanage.domain.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardmanage.domain.dto.ClanDto;
import com.cardmanage.domain.repository.ClanMRepository;
import com.cardmanage.infrastructure.entity.ClanEntity;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ClanMService {
	@Autowired
	ClanMRepository clanMRepository;

	public List<ClanEntity> getAllClanList(){
		return clanMRepository.findAll();	
	}
	public ClanDto createClan(ClanDto clanData) {
		return clanMRepository.save(clanData);
	}

	public List<ClanEntity> searchClan(String clanId, String memberStateId){
		return clanMRepository.search(clanId, memberStateId);
	}
}
