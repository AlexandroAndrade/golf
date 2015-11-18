/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.service;

import com.gigaware.golf.dao.BranchDao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gigaware.golf.dao.MemberDao;
import com.gigaware.golf.entity.Member;
import com.gigaware.golf.exception.customer.MemberException;

import org.apache.commons.lang3.StringUtils;


/**
 * @author alex andrade yngwie_alex@hotmail.com
 */
@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService, Serializable {

    private static final long serialVersionUID = 4801185605237096560L;

    @Autowired
    MemberDao memberDao;

    @Autowired
    BranchDao branchDao;

    @Override
    public void save( Member m ) throws MemberException {
    		
    	sanitizeFields( m );
    	
    	validateEmptyFields( m );
    	
    	if(memberDao.getByMemberKey( m.getMemberKey() ) != null ){
    		String message = "Member already exists with Member Key: " + m.getMemberKey();
    		throw new MemberException( message );
    	}
    	
    	if(memberDao.getByNameFirstLastNameAndSecondLastName(m.getNames(), m.getFirstLastName(), m.getSecondLastName() ) != null ){
    		StringBuilder message = new StringBuilder();
    		message.append( "Member already existe with Names: " )
    		       .append( m.getNames() + ", ")
    		       .append("First Last Name: " + m.getFirstLastName()  + ", ")
    		       .append("and Second Last Name: " + m.getSecondLastName() + ".");
    		throw new MemberException( message.toString() );
    	}
    	
    	
        memberDao.save( m );
    }


    
    private void sanitizeFields( Member m ){
    	m.setNames( m.getNames().trim() );
    	m.setFirstLastName( m.getFirstLastName().trim() );
    	m.setSecondLastName( m.getSecondLastName().trim() );
    	m.setAddress( m.getAddress().trim() );
    	m.setPhoneNumber( m.getPhoneNumber().trim() );
    	m.setEmail( m.getEmail().trim() );
    	m.setMemberKey( m.getMemberKey().trim() );
    }
    
    @Override
    public void saveAll( List<Member> members ) {
    	memberDao.saveAll( members );
    }

    @Override
    public void update( Member m ) throws MemberException {
    	
    	sanitizeFields( m );
    	validateEmptyFields( m );
        memberDao.update( m );
    }
    
	private void validateEmptyFields( Member m ) throws MemberException {
		if ( hasEmptyFields( m ) ) {
			String message = "Member to Save has Empty Fields";
			throw new MemberException( message );
		}
	}
    
	/**
	 * Validate all Member fields are not Empty
	 */
	private boolean hasEmptyFields( Member m ) {

		if( StringUtils.isEmpty(m.getNames() )
				|| StringUtils.isEmpty( m.getFirstLastName() )
				|| StringUtils.isEmpty( m.getSecondLastName() )
				|| StringUtils.isEmpty( m.getAddress() )
				|| StringUtils.isEmpty( m.getPhoneNumber() )
				|| StringUtils.isEmpty( m.getEmail() )
				|| StringUtils.isEmpty( m.getMemberKey() )
				|| m.getHandicap() == null ){
			return true;
		}

		return false;
	}    	
    

    @Override
    public void delete( Member m ) {
        memberDao.delete( m );
    }

    @Override
    public List<Member> getAll() {
        return memberDao.getAll();
    }

    @Override
    public Member getById( Long idPerson ) {
        return memberDao.getById( idPerson );
    }

    @Override
    public Member createEmptyMember() {
        Member m = new Member();
        m.setNames( StringUtils.EMPTY );
        m.setFirstLastName( StringUtils.EMPTY );
        m.setSecondLastName( StringUtils.EMPTY );
        m.setMemberKey( StringUtils.EMPTY );
        m.setAddress( StringUtils.EMPTY );
        m.setPhoneNumber( StringUtils.EMPTY );
        m.setEmail( StringUtils.EMPTY );
        m.setHandicap( 0 );

        m.setBranch( branchDao.getBranchById( 1L ) );
        return m;
    }

    public void setMemberDao( MemberDao memberDao ) {
        this.memberDao = memberDao;
    }

    public void setBranchDao( BranchDao branchDao ) {
        this.branchDao = branchDao;
    }

}
