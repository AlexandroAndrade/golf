/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gigaware.main.golf.dao.BranchDao;
import com.gigaware.main.golf.dao.HoleDao;
import com.gigaware.main.golf.dao.MemberDao;
import com.gigaware.main.golf.dao.UserDao;
import com.gigaware.main.golf.entity.User;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public class Init {

	public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		BranchDao branchDao = (BranchDao) ac.getBean("branchDao");
		MemberDao memberDao = (MemberDao) ac.getBean("memberDao");
		HoleDao   holeDao   = (HoleDao  ) ac.getBean("holeDao");
		UserDao   userDao   = (UserDao  ) ac.getBean("userDao");
		
		User u = userDao.getByNickName("michaelS");
		escribe(u);
	}
	
	private static void escribe(Object o){
		System.out.println(o);
	}
}
