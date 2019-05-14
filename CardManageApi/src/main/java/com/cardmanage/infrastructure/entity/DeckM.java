package com.cardmanage.infrastructure.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="DECK_M")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeckM implements Serializable{
	@Id
	@Column(name="DECK_ID",nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DECK_ID_SEQ")
	@SequenceGenerator(name="DECK_ID_SEQ", sequenceName="DECK_ID_SEQ", allocationSize=1)
	private Integer deckId;
	@Column(name="CLAN_ID",nullable=false)
	private Integer clanId;
	@Column(name="DECK_NAME")
	private String deckName;
	@Column(name="REGULATION_FLAG",nullable=false)
	private Integer regFlag;
}