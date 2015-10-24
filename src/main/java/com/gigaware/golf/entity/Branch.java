/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Entity
@Table(name = "Sucursal")
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSucursal", nullable = false)
	private Long idBranch;
	
	@Column(name = "nombreSucursal", length = 45, nullable = false)
	private String branchName;
	
	@Column(name = "direccion", length = 255, nullable = false)
	private String address;

	@Column(name = "telefono", length = 50, nullable = false)
	private String phone;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch")
	private Set<Member> members = new HashSet<Member>();
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "branch")
	private Set<Hole> holes = new HashSet<Hole>();
	
	/**
	 * @return the idBranch
	 */
	public Long getIdBranch() {
		return idBranch;
	}

	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}



	/**
	 * @return the members
	 */
	public Set<Member> getMembers() {
		return members;
	}



	/**
	 * @param members the members to set
	 */
	public void setMembers(Set<Member> members) {
		this.members = members;
	}
	
	
	
	/**
	 * @return the holes
	 */
	public Set<Hole> getHoles() {
		return holes;
	}

	/**
	 * @param holes the holes to set
	 */
	public void setHoles(Set<Hole> holes) {
		this.holes = holes;
	}

	@Override
	public boolean equals(Object o){
		if(o == this){
			return true;
		}
		
		if(o instanceof Branch){
			Branch b = (Branch) o;
			if(b.idBranch != null){
				EqualsBuilder eq = new EqualsBuilder();
				eq.append(this.idBranch.longValue(), b.idBranch.longValue());
				return eq.isEquals();
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		HashCodeBuilder hc = new HashCodeBuilder(-13, 7);
		if(this.idBranch != null){
			hc.append(this.idBranch);
		}
		return hc.hashCode();
	}
	
}
