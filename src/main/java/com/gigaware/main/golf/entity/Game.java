/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.entity;

import java.util.Date;

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
	private Member member;

	@Column(name = "totalGolpes", nullable = false)
	private Integer totalHits;
	
	@Column(name = "fechaJuego", nullable = false)
	private Date date;
	
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
	 * @return the totalHits
	 */
	public Integer getTotalHits() {
		return totalHits;
	}
	/**
	 * @param totalHits the totalHits to set
	 */
	public void setTotalHits(Integer totalHits) {
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
	
	

}
