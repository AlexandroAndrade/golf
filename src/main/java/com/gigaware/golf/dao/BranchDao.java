/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao;

import java.util.List;

import com.gigaware.golf.dao.factory.GenericDao;
import com.gigaware.golf.entity.Branch;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public interface BranchDao extends GenericDao<Branch> {
	
	List<Branch> getAll();
	Branch getBranchById(final Long id);

}