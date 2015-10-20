package com.gigaware.main.golf.dao;

import java.util.List;

import com.gigaware.main.golf.dao.factory.GenericDao;
import com.gigaware.main.golf.entity.Member;

public interface MemberDao extends GenericDao<Member> {
	
	List<Member> getAll();
	Member getMemberById(Long idMember);
	
	
}
