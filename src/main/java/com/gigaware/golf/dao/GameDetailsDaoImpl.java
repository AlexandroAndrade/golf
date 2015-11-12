/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gigaware.golf.constants.QueryConstants;
import com.gigaware.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.golf.entity.GameDetails;

/**
 * @author alex andrade yngwie_alex@hotmail.com
 */
@Repository("gameDetailsDao")
public class GameDetailsDaoImpl
        extends AbstractHibernateDao
        implements GameDetailsDao, Serializable {

    private static final long serialVersionUID = -887086887534931387L;

    @Override
    public void save( GameDetails gd ) {
        super.getSessionFactory().getCurrentSession().save( gd );
    }

    @Override
    public void saveAll( List<GameDetails> gameDetails ) {
        for ( GameDetails gd : gameDetails ) {
            this.save( gd );
        }
    }

    @Override
    public void update( GameDetails gd ) {
        super.getSessionFactory().getCurrentSession().update( gd );
    }

    @Override
    public void delete( GameDetails gd ) {
        super.getSessionFactory().getCurrentSession().delete( gd );
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<GameDetails> getGameDetailsByGame( Long idGame ) {
        return (List<GameDetails>) 
                super.createQuery( QueryConstants.GAME_DETAILS_GET_BY_GAME )
                     .setParameter( "idGame", idGame )
                     .list();
    }

    @Override
    public List<GameDetails> getGameDetailsByMemberAndGame( Long idPerson,
            Long idGame ) {
        // TODO Auto-generated method stub
        return null;
    }

}
