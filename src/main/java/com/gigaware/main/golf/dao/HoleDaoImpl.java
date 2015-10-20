/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gigaware.main.golf.constants.QueryConstants;
import com.gigaware.main.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.main.golf.entity.Hole;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Repository("holeDao")
public class HoleDaoImpl 
	extends AbstractHibernateDao
	implements HoleDao, Serializable{

	private static final long serialVersionUID = -1094980201667488768L;

	@Override
	public void save(Hole h) {
		super.getSessionFactory().getCurrentSession().save(h);
	}
	
	@Override
	public void saveAll(List<Hole> holes) {
		for(Hole h : holes){
			this.save(h);
		}
	}

	@Override
	public void update(Hole h) {
		super.getSessionFactory().getCurrentSession().update(h);
	}

	@Override
	public void delete(Hole h) {
		super.getSessionFactory().getCurrentSession().delete(h);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hole> getAll() {
		return (List<Hole>) super.createQuery(QueryConstants.HOLE_GET_ALL).list();
	}

	@Override
	public Hole getHoleById(Long idHole) {
		return (Hole) super.createQuery(QueryConstants.HOLE_GET_BY_ID).setParameter("idHole", idHole).uniqueResult();
	}
	
	
	

}
