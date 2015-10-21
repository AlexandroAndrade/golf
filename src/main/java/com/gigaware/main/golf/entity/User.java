/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Entity
@Table(name = "Usuario", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"nickName"})
})
public class User extends Person{
	
	@Column(name = "nickName", length = 45, nullable = false)
	private String nickName;

	@Column(name = "password", length = 1024, nullable = false)
	private String password;
	
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == this){
			return true;
		}
		
		if(o instanceof User){
			User u = (User) o;
			EqualsBuilder eq = new EqualsBuilder();
					
			if(this.getIdPerson() != null && this.getIdPerson() > 0L){
				eq.append(this.getIdPerson(), u.getIdPerson());
			}
			if(!StringUtils.isEmpty(this.nickName)){
				eq.append(this.nickName, u.nickName);
			}
				
			return eq.isEquals();
		}
		
		return false;
	}
	
	
	@Override
	public int hashCode(){
		HashCodeBuilder hc = new HashCodeBuilder(7, -11);
		
		if(this.getIdPerson() != null && this.getIdPerson() > 0L){
			hc.append(this.getIdPerson());
		}
		if(!StringUtils.isEmpty(this.nickName)){
			hc.append(this.nickName);
		}
		
		return hc.hashCode();
	}
	
	@Override
	public String toString(){
		ToStringBuilder tsb = new ToStringBuilder(this, ToStringStyle.NO_CLASS_NAME_STYLE);

		tsb.append("Id: "+ this.getIdPerson())
		   .append(" Names: " + this.getNames())
		   .append(" First Last Name: " + this.getFirstLastName())
		   .append(" Second Last Name: " + this.getSecondLastName())
		   .append(" NickName: " + this.nickName);
		 
		return tsb.toString();
	}
}
