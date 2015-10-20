package com.gigaware.main.golf.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gigaware.main.golf.constants.QueryConstants;
import com.gigaware.main.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.main.golf.entity.Member;

@Repository("memberDao")
public class MemberDaoImpl extends AbstractHibernateDao implements MemberDao, Serializable{

	private static final long serialVersionUID = -6300384378000770861L;

	public void saveMember(Member m) {
		// TODO Auto-generated method stub
		
	}

	public void updateMember(Member m) {
		// TODO Auto-generated method stub
		
	}

	public void deleteMember(Member m) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public List<Member> getAll() {
		return (List<Member>) super.createQuery(QueryConstants.MEMBER_GET_ALL).list();
	}

	public Member getMemberById(Long idMember) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
