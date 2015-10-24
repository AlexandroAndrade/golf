/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Entity
@Table(name = "juegoDetalle", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"idJuego", "idSocio", "idHoyo"})
})
public class GameDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idJuegoDetalle", nullable = false)
	private Long idGameDetails;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idJuego", nullable = false)
	private Game game;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idSocio", nullable = false)
	private Member member;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idHoyo", nullable = false)
	private Hole hole;
	
	@Column(name = "golpes", nullable = false)
	private Long hitsByHole;
	
	/**
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}
	/**
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
	}
	/**
	 * @return the member
	 */
	public Member getMember() {
		return member;
	}
	/**
	 * @param member the member to set
	 */
	public void setMember(Member member) {
		this.member = member;
	}
	/**
	 * @return the hole
	 */
	public Hole getHole() {
		return hole;
	}
	/**
	 * @param hole the hole to set
	 */
	public void setHole(Hole hole) {
		this.hole = hole;
	}
	/**
	 * @return the hitsByHole
	 */
	public Long getHitsByHole() {
		return hitsByHole;
	}
	/**
	 * @param hitsByHole the hitsByHole to set
	 */
	public void setHitsByHole(Long hitsByHole) {
		this.hitsByHole = hitsByHole;
	}
	/**
	 * @return the idGameDetails
	 */
	public Long getIdGameDetails() {
		return idGameDetails;
	}
	
	

}
