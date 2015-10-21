/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gigaware.main.golf.dao.BranchDao;
import com.gigaware.main.golf.dao.HoleDao;
import com.gigaware.main.golf.dao.MemberDao;
import com.gigaware.main.golf.dao.UserDao;
import com.gigaware.main.golf.entity.Branch;
import com.gigaware.main.golf.entity.Hole;
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
		
		List<Hole> h = holeDao.getAll(1L);
		escribe(h);
		
		escribe(holeDao.getTotalHits(1L));
	}
	
	private static void escribe(Object o){
		System.out.println(o);
	}
}
