package com.cardmanage.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cardmanage.infrastructure.entity.ClanEntity;

public interface ClanMJpaRepository extends JpaRepository<ClanEntity, String>{
}
