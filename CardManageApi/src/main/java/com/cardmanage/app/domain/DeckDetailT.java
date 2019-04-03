package com.cardmanage.app.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="DECK_DETAIL_T")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeckDetailT implements Serializable{
	@Id
	@Column(name="DECK_ID",nullable=false)
	private Integer deckId;
	@Column(name="CARD_ID",nullable=false)
	private Integer cardId;
	@Column(name="ADOPT_NUM",nullable=false)
	private String adoptNum;
	@Column(name="DECK_TYPE_FLAG")
	private Integer deckTypeFlag;
}