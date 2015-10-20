package com.gigaware.main.golf.dao.factory;

public interface GenericDao<T> {
	
	void save(T t);
	void update(T t);
	void delete(T t);
	
}
