package com.gigaware.main.golf.dao;

import java.util.List;

import com.gigaware.main.golf.dao.factory.GenericDao;
import com.gigaware.main.golf.entity.Branch;

public interface BranchDao extends GenericDao<Branch> {
	
	List<Branch> getAll();
	Branch getBranchById(final Long id);

}