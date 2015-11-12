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
import java.io.Serializable;

/**
 * @author alex andrade yngwie_alex@hotmail.com
 */
@Controller
public class MemberCatalogController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private MemberService memberService;
    private Member member = new Member();
    private List<Member> membersList;

    /**
     * Buttons
     */
    private boolean buttonNewEnabled;
    private boolean buttonSaveEnabled;
    private boolean buttonModifyEnabled;
    private boolean buttonDeleteEnabled;
    private boolean buttonCancelEnabled;

    /**
     * Input Texts Read Only
     */
    private boolean inputNamesReadOnly;
    private boolean inputFirstLastNameReadOnly;
    private boolean inputSecondLastNameReadOnly;
    private boolean inputMemberKey;
    private boolean inputAddressReadOnly;
    private boolean inputPhoneNumberReadOnly;
    private boolean inputEmailReadOnly;
    private boolean inputHandicapReadOnly;

    /**
     * Flag New Member / Existing Member *
     */
    private boolean newMember;

    /**
     * Custom Constructor
     */
    public MemberCatalogController() {
        this.member = new Member();
    }

    public void initialize() {

        this.membersList = memberService.getAll();
        this.member = memberService.createEmptyMember();

        this.buttonNewEnabled = true;
        this.buttonModifyEnabled = false;
        this.buttonSaveEnabled = true;
        this.buttonDeleteEnabled = false;

        this.inputNamesReadOnly = false;
        this.inputFirstLastNameReadOnly = false;
        this.inputSecondLastNameReadOnly = false;
        this.inputMemberKey = false;
        this.inputAddressReadOnly = false;
        this.inputPhoneNumberReadOnly = false;
        this.inputEmailReadOnly = false;
        this.inputHandicapReadOnly = false;

        this.newMember = true;

    }

    public void buttonNewMember() {

        this.member = memberService.createEmptyMember();
        this.newMember = true;

        this.buttonNewEnabled = true;
        this.buttonModifyEnabled = false;
        this.buttonSaveEnabled = true;
        this.buttonDeleteEnabled = false;

        this.inputNamesReadOnly = false;
        this.inputFirstLastNameReadOnly = false;
        this.inputSecondLastNameReadOnly = false;
        this.inputMemberKey = false;
        this.inputAddressReadOnly = false;
        this.inputPhoneNumberReadOnly = false;
        this.inputEmailReadOnly = false;
        this.inputHandicapReadOnly = false;

    }

    public void buttonModifyMember() {
        this.newMember = false;

        this.buttonNewEnabled = true;
        this.buttonModifyEnabled = false;
        this.buttonSaveEnabled = true;
        this.buttonDeleteEnabled = true;

        this.inputNamesReadOnly = false;
        this.inputFirstLastNameReadOnly = false;
        this.inputSecondLastNameReadOnly = false;
        this.inputMemberKey = false;
        this.inputAddressReadOnly = false;
        this.inputPhoneNumberReadOnly = false;
        this.inputEmailReadOnly = false;
        this.inputHandicapReadOnly = false;
    }

    public void onRowSelect( SelectEvent event ) {

        this.member = (Member) event.getObject();

        this.buttonNewEnabled = true;
        this.buttonSaveEnabled = false;
        this.buttonModifyEnabled = true;
        this.buttonDeleteEnabled = true;

        this.inputNamesReadOnly = true;
        this.inputFirstLastNameReadOnly = true;
        this.inputSecondLastNameReadOnly = true;
        this.inputMemberKey = true;
        this.inputAddressReadOnly = true;
        this.inputPhoneNumberReadOnly = true;
        this.inputEmailReadOnly = true;
        this.inputHandicapReadOnly = true;

    }

    public void saveMember() {
        memberService.save( this.member );
        this.initialize();
    }

    public void deleteMember() {
        memberService.delete( member );
    }

    public void setMemberService( MemberService memberService ) {
        this.memberService = memberService;
    }

    public Member getMember() {
        return member;
    }

    public void setMember( Member member ) {
        if ( !this.newMember ) {
            this.member = member;
        }
    }

    public List<Member> getMembersList() {
        return membersList;
    }

    public void setMembersList( List<Member> membersList ) {
        this.membersList = membersList;
    }

    public boolean isButtonNewEnabled() {
        return buttonNewEnabled;
    }

    public void setButtonNewEnabled( boolean buttonNewEnabled ) {
        this.buttonNewEnabled = buttonNewEnabled;
    }

    public boolean isButtonSaveEnabled() {
        return buttonSaveEnabled;
    }

    public void setButtonSaveEnabled( boolean buttonSaveEnabled ) {
        this.buttonSaveEnabled = buttonSaveEnabled;
    }

    public boolean isButtonModifyEnabled() {
        return buttonModifyEnabled;
    }

    public void setButtonModifyEnabled( boolean buttonModifyEnabled ) {
        this.buttonModifyEnabled = buttonModifyEnabled;
    }

    public boolean isButtonDeleteEnabled() {
        return buttonDeleteEnabled;
    }

    public void setButtonDeleteEnabled( boolean buttonDeleteEnabled ) {
        this.buttonDeleteEnabled = buttonDeleteEnabled;
    }

    /**
     * @return the buttonCancelEnabled
     */
    public boolean isButtonCancelEnabled() {
        return buttonCancelEnabled;
    }

    /**
     * @param buttonCancelEnabled the buttonCancelEnabled to set
     */
    public void setButtonCancelEnabled( boolean buttonCancelEnabled ) {
        this.buttonCancelEnabled = buttonCancelEnabled;
    }

    public boolean isInputNamesReadOnly() {
        return inputNamesReadOnly;
    }

    public void setInputNamesReadOnly( boolean inputNamesReadOnly ) {
        this.inputNamesReadOnly = inputNamesReadOnly;
    }

    public boolean isInputFirstLastNameReadOnly() {
        return inputFirstLastNameReadOnly;
    }

    public void setInputFirstLastNameReadOnly( boolean inputFirstLastNameReadOnly ) {
        this.inputFirstLastNameReadOnly = inputFirstLastNameReadOnly;
    }

    public boolean isInputSecondLastNameReadOnly() {
        return inputSecondLastNameReadOnly;
    }

    public void setInputSecondLastNameReadOnly( boolean inputSecondLastNameReadOnly ) {
        this.inputSecondLastNameReadOnly = inputSecondLastNameReadOnly;
    }

    /**
     * @return the inputMemberKey
     */
    public boolean isInputMemberKey() {
        return inputMemberKey;
    }

    /**
     * @param inputMemberKey the inputMemberKey to set
     */
    public void setInputMemberKey( boolean inputMemberKey ) {
        this.inputMemberKey = inputMemberKey;
    }

    public boolean isInputAddressReadOnly() {
        return inputAddressReadOnly;
    }

    public void setInputAddressReadOnly( boolean inputAddressReadOnly ) {
        this.inputAddressReadOnly = inputAddressReadOnly;
    }

    public boolean isInputPhoneNumberReadOnly() {
        return inputPhoneNumberReadOnly;
    }

    public void setInputPhoneNumberReadOnly( boolean inputPhoneNumberReadOnly ) {
        this.inputPhoneNumberReadOnly = inputPhoneNumberReadOnly;
    }

    public boolean isInputEmailReadOnly() {
        return inputEmailReadOnly;
    }

    public void setInputEmailReadOnly( boolean inputEmailReadOnly ) {
        this.inputEmailReadOnly = inputEmailReadOnly;
    }

    public boolean isInputHandicapReadOnly() {
        return inputHandicapReadOnly;
    }

    public void setInputHandicapReadOnly( boolean inputHandicapReadOnly ) {
        this.inputHandicapReadOnly = inputHandicapReadOnly;
    }

    public boolean isNewMember() {
        return newMember;
    }

    public void setNewMember( boolean newMember ) {
        this.newMember = newMember;
    }

}
