/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gigaware.main.golf.dao.BranchDao;
import com.gigaware.main.golf.dao.GameDao;
import com.gigaware.main.golf.dao.GameDetailsDao;
import com.gigaware.main.golf.dao.HoleDao;
import com.gigaware.main.golf.dao.MemberDao;
import com.gigaware.main.golf.dao.UserDao;
import com.gigaware.main.golf.entity.Branch;
import com.gigaware.main.golf.entity.Game;
import com.gigaware.main.golf.entity.GameDetails;
import com.gigaware.main.golf.entity.Hole;
import com.gigaware.main.golf.entity.Member;
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
		GameDao   gameDao   = (GameDao  ) ac.getBean("gameDao");
		GameDetailsDao gameDetailsDao = (GameDetailsDao) ac.getBean("gameDetailsDao");
	
		List<GameDetails> gd = gameDetailsDao.getGameDetailsByGame(1L);
		
		escribe(gd.size());
		
		
	}
	
	
	
	private static void escribe(Object o){
		System.out.println(o);
	}
}
