/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.dao;

import java.util.List;

import com.gigaware.main.golf.dao.factory.GenericDao;
import com.gigaware.main.golf.entity.Member;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public interface MemberDao extends GenericDao<Member> {
	
	List<Member> getAll();
	Member getById(final Long idPerson);
	
	
}
