/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao;

import java.util.List;

import com.gigaware.golf.dao.factory.GenericDao;
import com.gigaware.golf.entity.User;

/**
 * @author alex andrade yngwie_alex@hotmail.com
 */
public interface UserDao extends GenericDao<User> {

    List<User> getAll();
    User getByNickName( final String nickName );
    User getByNickNameAndPassword( final String nickName, final String password );

}
