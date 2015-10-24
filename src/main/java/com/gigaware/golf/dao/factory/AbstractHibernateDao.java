/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao.factory;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public abstract class AbstractHibernateDao {
		
	@Autowired
	private SessionFactory sessionFactory;
	
	public Query createQuery(final String query){
		return getSessionFactory().getCurrentSession().createQuery(query);
	}

	/**
	 * @return the sessionFactory
	 */
	protected final SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	protected final void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	
}
