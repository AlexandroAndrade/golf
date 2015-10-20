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

	public void saveBranch(Branch b) {
		// TODO Auto-generated method stub
		
	}

	public void updateBranch(Branch b) {
		// TODO Auto-generated method stub
		
	}

	public void deleteBranch(Branch b) {
		// TODO Auto-generated method stub
		
	}

	public List<Branch> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Branch getBranchById(Long idBranch) {
		return (Branch) super.createQuery(QueryConstants.BRANCH_GET_BY_ID).setParameter("idBranch", idBranch).uniqueResult();
	}
	
	

}
