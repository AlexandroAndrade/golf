/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Entity
@Table(name = "Socio", uniqueConstraints = {
		@UniqueConstraint(columnNames = "claveSocio")
})
public class Member extends Person {
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idSucursal", nullable = false)
	private Branch branch;
	
	@Column(name = "claveSocio", length = 10, nullable = false)
	private String memberKey;
	
	@Column(name = "handicap", nullable = false)
	private Integer handicap;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
	private Set<GameDetails> gameDetails = new HashSet<GameDetails>();
	
	/**
	 * @return the branch
	 */
	public Branch getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	/**
	 * @return the memberKey
	 */
	public String getMemberKey() {
		return memberKey;
	}
	/**
	 * @param memberKey the memberKey to set
	 */
	public void setMemberKey(String memberKey) {
		this.memberKey = memberKey;
	}
	/**
	 * @return the handicap
	 */
	public Integer getHandicap() {
		return handicap;
	}
	/**
	 * @param handicap the handicap to set
	 */
	public void setHandicap(Integer handicap) {
		this.handicap = handicap;
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
	
	@Override
	public boolean equals(Object o){
		if(o == this){
			return true;
		}
		
		if(o instanceof Member){
			Member m = (Member) o;

			EqualsBuilder eq = new EqualsBuilder();

			if(m.getIdPerson() != null){
				eq.append(this.getIdPerson().longValue(), m.getIdPerson().longValue());
			}
			if(!StringUtils.isEmpty(this.memberKey)){
				eq.append(this.memberKey, m.memberKey);
			}
			return eq.isEquals();

		}
		
		return false;
	}
	
	@Override
	public int hashCode(){
		HashCodeBuilder hc = new HashCodeBuilder(-3, 11);
		if(this.getIdPerson() != null){
			hc.append(this.getIdPerson().longValue());
		}
		if(this.memberKey != null){
			hc.append(this.memberKey);
		}
		return hc.hashCode();
	}
	
}
