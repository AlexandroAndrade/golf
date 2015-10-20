package com.gigaware.main.golf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.InheritanceType;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Persona", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"nombres", "apellidoPaterno", "apellidoPaterno"}),
		@UniqueConstraint(columnNames = "email")
})
public abstract class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersona", unique = true, nullable = false)
	private Long idPerson;

	@Column(name = "nombres", length = 70, nullable = false)
	private String names;
	
	@Column(name = "apellidoPaterno", length = 45, nullable = false)
	private String firstLastName;

	@Column(name = "apellidoMaterno", length = 45, nullable = false)
	private String secondLastName;
	
	@Column(name = "direccion", length = 45, nullable = false)
	private String address;
	
	@Column(name = "telefono", length = 45, nullable = false)
	private String phoneNumber;
	
	@Column(name = "email", length = 45, nullable = false)
	private String email;
	
	/**
	 * @return the idPerson
	 */
	public Long getIdPerson() {
		return idPerson;
	}
	
	/**
	 * @return the names
	 */
	public String getNames() {
		return names;
	}
	
	/**
	 * @param names the names to set
	 */
	public void setNames(String names) {
		this.names = names;
	}
	
	/**
	 * @return the firstLastName
	 */
	public String getFirstLastName() {
		return firstLastName;
	}
	
	/**
	 * @param firstLastName the firstLastName to set
	 */
	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}
	
	/**
	 * @return the secondLastName
	 */
	public String getSecondLastName() {
		return secondLastName;
	}
	
	/**
	 * @param secondLastName the secondLastName to set
	 */
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
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
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
