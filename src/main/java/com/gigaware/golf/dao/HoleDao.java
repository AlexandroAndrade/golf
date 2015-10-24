/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao;

import java.util.List;

import com.gigaware.golf.dao.factory.GenericDao;
import com.gigaware.golf.entity.Hole;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public interface HoleDao extends GenericDao<Hole> {

	List<Hole> getAll(final Long idBranch);
	Hole getHoleById(final Long idHole);
	Long getTotalHits(final Long idBranch);
	
}
