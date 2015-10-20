package com.gigaware.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gigaware.main.golf.dao.BranchDao;
import com.gigaware.main.golf.dao.MemberDao;
import com.gigaware.main.golf.entity.Branch;
import com.gigaware.main.golf.entity.Member;

public class Init {

	public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		BranchDao branchDao = (BranchDao) ac.getBean("branchDao");
		MemberDao memberDao = (MemberDao) ac.getBean("memberDao");
		
		List<Member> members = memberDao.getAll();
		escribe(members.size());

		Member m = new Member();
		m.setNames("James Alan");
		m.setFirstLastName("Hetfield");
		m.setSecondLastName("");
		m.setPhoneNumber("+1-887-5467");
		m.setEmail("james.hetfiel@metallica.com");
		m.setAddress("Lincoln Rd. #494, San Francisco, California");
		m.setHandicap(0);
		m.setMemberKey("JAHET");
		m.setBranch(branchDao.getBranchById(1L));
		memberDao.save(m);
		
		members = memberDao.getAll();
		escribe(members.size());



		
	}

	private static void escribe(Object o){
		System.out.println(o);
	}
}
