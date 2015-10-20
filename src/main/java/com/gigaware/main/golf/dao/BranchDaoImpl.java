package com.gigaware.main.golf.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gigaware.main.golf.constants.QueryConstants;
import com.gigaware.main.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.main.golf.entity.Branch;

@Repository("branchDao")
public class BranchDaoImpl 
	extends AbstractHibernateDao
	implements BranchDao, Serializable{

	private static final long serialVersionUID = 1133811549995263399L;

	@Override
	public void save(Branch b) {
		super.getSessionFactory().getCurrentSession().save(b);
	}

	@Override
	public void update(Branch b) {
		super.getSessionFactory().getCurrentSession().update(b);
	}

	@Override
	public void delete(Branch b) {
		super.getSessionFactory().getCurrentSession().delete(b);
	}
	
	public Branch getBranchById(Long idBranch) {
		return (Branch) super.createQuery(QueryConstants.BRANCH_GET_BY_ID).setParameter("idBranch", idBranch).uniqueResult();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Branch> getAll() {
		return (List<Branch>) super.createQuery(QueryConstants.BRANCH_GET_ALL).list();
	}

}
