/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.dao.factory;

import java.util.List;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public interface GenericDao<T> {
	
	void save(T t);
	void saveAll(List<T> ts);
	void update(T t);
	void delete(T t);
	
}
