package com.gigaware.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gigaware.main.golf.dao.BranchDao;
import com.gigaware.main.golf.dao.MemberDao;
import com.gigaware.main.golf.dao.PersonDao;
import com.gigaware.main.golf.entity.Branch;
import com.gigaware.main.golf.entity.Member;
import com.gigaware.main.golf.entity.Person;

public class Init {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");

		PersonDao personDao = (PersonDao) ac.getBean("personDao");
		MemberDao memberDao = (MemberDao) ac.getBean("memberDao");
		BranchDao branchDao = (BranchDao) ac.getBean("branchDao");
		
		
		List<Member> members = memberDao.getAll();
		escribe("=== Members ===");
		escribe(members);
		escribe(members.size());
		
		Branch b = branchDao.getBranchById(1L);
		escribe("=== Members ===");
		escribe(b);
		escribe(b.getBranchName());
		
		
	}

	private static void escribe(Object o){
		System.out.println(o);
	}
}
