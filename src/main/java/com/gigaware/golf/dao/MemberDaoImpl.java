/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.gigaware.golf.constants.QueryConstants;
import com.gigaware.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.golf.entity.Member;

/**
 * @author Alex Andrade ( yngwie_alex@hotmail.com )
 */
@Repository("memberDao")
public class MemberDaoImpl
        extends AbstractHibernateDao
        implements MemberDao, Serializable {

    private static final long serialVersionUID = -6300384378000770861L;

    @Override
    public void save( Member m ) {
        super.getSessionFactory().getCurrentSession().saveOrUpdate( m );
    }

    @Override
    public void saveAll( List<Member> members ) {
        for ( Member m : members ) {
            this.save( m );
        }
    }

    @Override
    public void update( Member m ) {
        super.getSessionFactory().getCurrentSession().update( m );
    }

    @Override
    public void delete( Member m ) {
        super.getSessionFactory().getCurrentSession().delete( m );
    }

    public Member getById( Long idPerson ) {
        return (Member) 
                super.createQuery( QueryConstants.MEMBER_GET_BY_ID )
                     .setParameter( "idPerson", idPerson )
                     .uniqueResult();
    }

    @SuppressWarnings("unchecked")
    public List<Member> getAll() {
        return (List<Member>) 
                super.createQuery( QueryConstants.MEMBER_GET_ALL ).list();
    }

	@Override
	public Member getByNameFirstLastNameAndSecondLastName(
			final String names,
			final String firstLastName, 
			final String secondLastName) {
		
		return ( Member )
					super
						.createQuery(QueryConstants.MEMBER_GET_BY_NAMES_FIRSTLASTNAME_SECONDLASTNAME)
						.setParameter("names", names)
						.setParameter("firstLastName", firstLastName)
						.setParameter("secondLastName", secondLastName)
						.uniqueResult();

	}

	@Override
	public Member getByMemberKey(String memberKey) {

		return ( Member )
					super
						.createQuery(QueryConstants.MEMBER_GET_BY_MEMBER_KEY)
						.setParameter("memberKey", memberKey)
						.uniqueResult();
						
	}
    
    

}






