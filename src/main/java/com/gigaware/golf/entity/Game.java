/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Entity
@Table(name = "Juego")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idJuego", nullable = false)
	private Long idGame;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idSocioGanador", nullable = false)
	private Member winnerMember;

	@Column(name = "totalGolpes", nullable = false)
	private Long totalHits;
	
	@Column(name = "fechaJuego", nullable = false)
	private Date date;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "game")
	Set<GameDetails> gameDetails = new HashSet<GameDetails>();
	
	/**
	 * @return the winnerMember
	 */
	public Member getWinnerMember() {
		return winnerMember;
	}
	
	/**
	 * @param winnerMember winnerMember
	 * This is the Member who won this game
	 */
	public void setWinnerMember(Member winnerMember) {
		this.winnerMember = winnerMember;
	}
	/**
	 * @return the totalHits
	 */
	public Long getTotalHits() {
		return totalHits;
	}
	/**
	 * @param totalHits the totalHits to set
	 */
	public void setTotalHits(Long totalHits) {
		this.totalHits = totalHits;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the idGame
	 */
	public Long getIdGame() {
		return idGame;
	}
	/**
	 * @return the gameDetails
	 */
	public Set<GameDetails> getGameDetails() {
		return gameDetails;
	}
	/**
	 * @param gameDetails the gameDetails to set
	 */
	public void setGameDetails(Set<GameDetails> gameDetails) {
		this.gameDetails = gameDetails;
	}
	
	

}
