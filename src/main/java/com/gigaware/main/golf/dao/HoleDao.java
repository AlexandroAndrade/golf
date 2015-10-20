/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.dao;

import java.util.List;

import com.gigaware.main.golf.dao.factory.GenericDao;
import com.gigaware.main.golf.entity.Hole;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public interface HoleDao extends GenericDao<Hole> {

	List<Hole> getAll();
	Hole getHoleById(final Long idHole);
	
}
