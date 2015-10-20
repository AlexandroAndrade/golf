package com.gigaware.main.golf.dao;

import java.util.List;

import com.gigaware.main.golf.entity.Person;

public interface PersonDao {
	
	
	List<Person> getAll();
	
	Person getById(final Long idPerson);
	
	Person getByNamesFirstAndSecondLastName(
			final String names, final String firstLastName,
			final String secondLastName);
	
	Person getByEmail(final String email);
	
}
