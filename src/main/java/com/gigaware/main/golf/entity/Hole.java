/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Entity
@Table(name = "Hoyo", uniqueConstraints = {
		
		@UniqueConstraint(columnNames = "Hoyo")
})
public class Hole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHoyo", nullable = false)
	private Long idHole;
	
	@Column(name = "Hoyo", length = 45, nullable = false)
	private String holeName;
	
	@Column(name = "longitudMetros", nullable = false)
	private Integer holeLength;
	/**
	 * @return the holeName
	 */
	public String getHoleName() {
		return holeName;
	}
	/**
	 * @param holeName the holeName to set
	 */
	public void setHoleName(String holeName) {
		this.holeName = holeName;
	}
	/**
	 * @return the holeLength
	 */
	public Integer getHoleLength() {
		return holeLength;
	}
	/**
	 * @param holeLength the holeLength to set
	 */
	public void setHoleLength(Integer holeLength) {
		this.holeLength = holeLength;
	}
	/**
	 * @return the idHole
	 */
	public Long getIdHole() {
		return idHole;
	}
	
	
	@Override
	public boolean equals(Object o){
		if(o == this){
			return true;
		}
		
		if(o instanceof Hole){
			Hole h = (Hole) o;
			if(h.idHole != null){
				EqualsBuilder eq = new EqualsBuilder();
				eq.append(this.idHole.longValue(), h.idHole.longValue());
				return eq.isEquals();
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		HashCodeBuilder hc = new HashCodeBuilder(-5, 5);
		if(this.idHole != null){
			hc.append(this.idHole.longValue());
		}
		return hc.hashCode();
	}
	
}
