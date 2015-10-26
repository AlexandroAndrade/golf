/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.controller;

import java.util.List;

import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gigaware.golf.entity.Member;
import com.gigaware.golf.service.MemberService;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Controller
public class MemberCatalogController {
	
	@Autowired
	private MemberService memberService;
	private Member member;
	private List<Member> membersList;
	
	public void initialize(){
		this.membersList = memberService.getAll();
	}
	
	public void addMember(){
		memberService.save(this.member);
		this.initialize();
	}
	
	public void deleteMember(){
		memberService.delete(member);
	}
	
	public void onRowSelect(SelectEvent event){
		this.member = (Member) event.getObject();
	}
	
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	public List<Member> getMembersList() {
		return membersList;
	}

	public void setMembersList(List<Member> membersList) {
		this.membersList = membersList;
	}
	
	
	
	
}
