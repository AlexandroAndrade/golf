/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gigaware.main.golf.constants.QueryConstants;
import com.gigaware.main.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.main.golf.entity.Member;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Repository("memberDao")
public class MemberDaoImpl extends AbstractHibernateDao implements MemberDao, Serializable{

	private static final long serialVersionUID = -6300384378000770861L;
		
	@Override
	public void save(Member m) {
		super.getSessionFactory().getCurrentSession().save(m);
	}

	@Override
	public void saveAll(List<Member> members) {
		for(Member m : members){
			this.save(m);
		}
	}
	
	@Override
	public void update(Member m) {
		super.getSessionFactory().getCurrentSession().update(m);
	}

	@Override
	public void delete(Member m) {
		super.getSessionFactory().getCurrentSession().delete(m);
	}
	
	public Member getMemberById(Long idMember) {
		return (Member) super.createQuery(QueryConstants.MEMBER_GET_BY_ID).setParameter("idMember", idMember).uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Member> getAll() {
		return (List<Member>) super.createQuery(QueryConstants.MEMBER_GET_ALL).list();
	}



	
}
