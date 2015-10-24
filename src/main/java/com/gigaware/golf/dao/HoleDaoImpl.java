/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gigaware.golf.constants.QueryConstants;
import com.gigaware.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.golf.entity.Hole;

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
	public List<Hole> getAll(final Long idBranch) {
		return (List<Hole>) super.createQuery(QueryConstants.HOLE_GET_ALL).setParameter("idBranch", idBranch).list();
	}

	@Override
	public Hole getHoleById(final Long idHole) {
		return (Hole) 
				super.createQuery(QueryConstants.HOLE_GET_BY_ID)
					 .setParameter("idHole", idHole)
					 .uniqueResult();
	}
	
	@Override
	public Long getTotalHits(final Long idBranch) {
		return (Long) 		
				super.createQuery(QueryConstants.HOLE_GET_TOTAL_HITS_BY_BRANCH)
					 .setParameter("idBranch", idBranch)
					 .uniqueResult();
	}
	

}
