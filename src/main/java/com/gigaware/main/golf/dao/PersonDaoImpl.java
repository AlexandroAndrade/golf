package com.gigaware.main.golf.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.gigaware.main.golf.constants.QueryConstants;
import com.gigaware.main.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.main.golf.entity.Person;

@Repository("personDao")
public class PersonDaoImpl 
	extends AbstractHibernateDao 
	implements PersonDao, Serializable {
	
	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = 452436575575239979L;
	
	@SuppressWarnings("unchecked")
	public List<Person> getAll() {
		
		final Query query = super.createQuery(QueryConstants.PERSON_GET_ALL);
		List<Person> persons = (List<Person>) query.list();
		
		if( CollectionUtils.isEmpty(persons)) {
			persons = new ArrayList<Person>();
		}
		
		return persons;
	}

	public Person getPersonById(Long idPerson) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getByNamesFirstAndSecondLastName(String names,
			String firstLastName, String secondLastName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Person getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
