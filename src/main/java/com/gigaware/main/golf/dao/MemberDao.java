package com.gigaware.main.golf.dao;

import java.util.List;

import com.gigaware.main.golf.entity.Member;

public interface MemberDao {
	
	void saveMember(Member m);
	void updateMember(Member m);
	void deleteMember(Member m);
	
	
	List<Member> getAll();
	Member getMemberById(Long idMember);
	
	
}
