package com.cardmanage.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardmanage.app.domain.ClanM;

@Repository
public interface ClanMRepository extends JpaRepository<ClanM, Integer>{

}
