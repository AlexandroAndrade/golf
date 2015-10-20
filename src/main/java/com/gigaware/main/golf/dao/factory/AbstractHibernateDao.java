package com.gigaware.main.golf.dao.factory;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
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
