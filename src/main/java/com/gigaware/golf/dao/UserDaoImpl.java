/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gigaware.golf.constants.QueryConstants;
import com.gigaware.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.golf.entity.User;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Repository("userDao")
public class UserDaoImpl 
	extends AbstractHibernateDao
	implements UserDao, Serializable {

	private static final long serialVersionUID = 2263622725375266759L;

	@Override
	public void save(User u) {
		super.getSessionFactory().getCurrentSession().save(u);
	}

	@Override
	public void saveAll(List<User> users) {
		for(User u : users){
			this.save(u);
		}
	}

	@Override
	public void update(User u) {
		super.getSessionFactory().getCurrentSession().update(u);
	}

	@Override
	public void delete(User u) {
		super.getSessionFactory().getCurrentSession().delete(u);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() {
		return (List<User>) super.createQuery(QueryConstants.USER_GET_ALL).list();
	}

	@Override
	public User getByNickName(String nickName) {
		return (User) 
				super.createQuery(QueryConstants.USER_GET_BY_NICK_NAME)
					 .setParameter("nickName", nickName)
					 .uniqueResult();
	}

	@Override
	public User getByNickNameAndPassword(String nickName, String password) {
		return (User)
				super.createQuery(QueryConstants.USER_GET_BY_NICK_NAME_AND_PASSWORD)
				     .setParameter("nickName", nickName)
				     .setParameter("password", password)
				     .uniqueResult();
	}
}
