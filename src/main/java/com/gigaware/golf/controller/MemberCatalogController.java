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
	
	/** Buttons */
	private boolean buttonNewEnabled;
	private boolean buttonAddEnabled;
	private boolean buttonModifyEnabled;
	private boolean buttonDeleteEnabled;
	
	
	/** Input Texts Read Only */
	private boolean inputNamesReadOnly;
	private boolean inputFirstLastNameReadOnly;
	private boolean inputSecondLastNameReadOnly;
	private boolean inputAddressReadOnly;
	private boolean inputPhoneNumberReadOnly;
	private boolean inputEmailReadOnly;
	private boolean inputHandicapReadOnly;
	
	/** Flag New Member / Existing Member **/
	private boolean newMember;
	
	
	
	public void initialize(){
		
		this.membersList = memberService.getAll();
		this.member = new Member();
		
		this.buttonNewEnabled    = false;
		this.buttonAddEnabled    = true;
		this.buttonModifyEnabled = false;
		this.buttonDeleteEnabled = false;
		
		this.inputNamesReadOnly		 	  = false;
		this.inputFirstLastNameReadOnly   = false;
		this.inputSecondLastNameReadOnly  = false;
		this.inputAddressReadOnly         = false;
		this.inputPhoneNumberReadOnly     = false;
		this.inputEmailReadOnly           = false;
		this.inputHandicapReadOnly        = false;
		
		this.newMember = true;
		
	}
	
	public void buttonNewMember(){
		
		this.member = new Member();
		this.newMember = true;
		
		this.buttonNewEnabled    = true;
		this.buttonAddEnabled    = true;
		this.buttonModifyEnabled = false;
		this.buttonDeleteEnabled = false;
		
		this.inputNamesReadOnly		 	  = true;
		this.inputFirstLastNameReadOnly   = true;
		this.inputSecondLastNameReadOnly  = true;
		this.inputAddressReadOnly         = true;
		this.inputPhoneNumberReadOnly     = true;
		this.inputEmailReadOnly           = true;
		this.inputHandicapReadOnly        = true;
		
	}
	
	public void onRowSelect(SelectEvent event){
		
		this.member = (Member) event.getObject();
		
		this.buttonNewEnabled    = true;
		this.buttonAddEnabled    = false;
		this.buttonModifyEnabled = true;
		this.buttonDeleteEnabled = true;
		
		this.inputNamesReadOnly		 	  = true;
		this.inputFirstLastNameReadOnly   = true;
		this.inputSecondLastNameReadOnly  = true;
		this.inputAddressReadOnly         = true;
		this.inputPhoneNumberReadOnly     = true;
		this.inputEmailReadOnly           = true;
		this.inputHandicapReadOnly        = true;
		
	}
	
	public void saveMember() {
		memberService.save(this.member);
		this.initialize();
	}
	
	public void deleteMember(){
		memberService.delete(member);
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

	public boolean isButtonNewEnabled() {
		return buttonNewEnabled;
	}

	public void setButtonNewEnabled(boolean buttonNewEnabled) {
		this.buttonNewEnabled = buttonNewEnabled;
	}

	public boolean isButtonAddEnabled() {
		return buttonAddEnabled;
	}

	public void setButtonAddEnabled(boolean buttonAddEnabled) {
		this.buttonAddEnabled = buttonAddEnabled;
	}

	public boolean isButtonModifyEnabled() {
		return buttonModifyEnabled;
	}

	public void setButtonModifyEnabled(boolean buttonModifyEnabled) {
		this.buttonModifyEnabled = buttonModifyEnabled;
	}

	public boolean isButtonDeleteEnabled() {
		return buttonDeleteEnabled;
	}

	public void setButtonDeleteEnabled(boolean buttonDeleteEnabled) {
		this.buttonDeleteEnabled = buttonDeleteEnabled;
	}

	public boolean isInputNamesReadOnly() {
		return inputNamesReadOnly;
	}

	public void setInputNamesReadOnly(boolean inputNamesReadOnly) {
		this.inputNamesReadOnly = inputNamesReadOnly;
	}

	public boolean isInputFirstLastNameReadOnly() {
		return inputFirstLastNameReadOnly;
	}

	public void setInputFirstLastNameReadOnly(boolean inputFirstLastNameReadOnly) {
		this.inputFirstLastNameReadOnly = inputFirstLastNameReadOnly;
	}

	public boolean isInputSecondLastNameReadOnly() {
		return inputSecondLastNameReadOnly;
	}

	public void setInputSecondLastNameReadOnly(boolean inputSecondLastNameReadOnly) {
		this.inputSecondLastNameReadOnly = inputSecondLastNameReadOnly;
	}

	public boolean isInputAddressReadOnly() {
		return inputAddressReadOnly;
	}

	public void setInputAddressReadOnly(boolean inputAddressReadOnly) {
		this.inputAddressReadOnly = inputAddressReadOnly;
	}

	public boolean isInputPhoneNumberReadOnly() {
		return inputPhoneNumberReadOnly;
	}

	public void setInputPhoneNumberReadOnly(boolean inputPhoneNumberReadOnly) {
		this.inputPhoneNumberReadOnly = inputPhoneNumberReadOnly;
	}

	public boolean isInputEmailReadOnly() {
		return inputEmailReadOnly;
	}

	public void setInputEmailReadOnly(boolean inputEmailReadOnly) {
		this.inputEmailReadOnly = inputEmailReadOnly;
	}

	public boolean isInputHandicapReadOnly() {
		return inputHandicapReadOnly;
	}

	public void setInputHandicapReadOnly(boolean inputHandicapReadOnly) {
		this.inputHandicapReadOnly = inputHandicapReadOnly;
	}

	public boolean isNewMember() {
		return newMember;
	}

	public void setNewMember(boolean newMember) {
		this.newMember = newMember;
	}

	
	
	
	
	
}
