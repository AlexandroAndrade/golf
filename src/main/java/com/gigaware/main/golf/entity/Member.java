package com.gigaware.main.golf.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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

	
}
