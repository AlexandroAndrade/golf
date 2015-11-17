/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.service;

import java.util.List;

import com.gigaware.golf.entity.Member;
import com.gigaware.golf.exception.customer.MemberException;
import com.gigaware.golf.service.factory.GenericService;

/**
 * @author alex andrade yngwie_alex@hotmail.com
 */
public interface MemberService extends GenericService<Member, MemberException> {

    List<Member> getAll();
    Member getById( final Long idPerson );
    Member createEmptyMember();

}
