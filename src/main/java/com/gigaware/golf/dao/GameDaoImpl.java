/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gigaware.golf.constants.QueryConstants;
import com.gigaware.golf.dao.factory.AbstractHibernateDao;
import com.gigaware.golf.entity.Game;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Repository("gameDao")
public class GameDaoImpl 
	extends AbstractHibernateDao 
	implements GameDao, Serializable {

	private static final long serialVersionUID = -1701002394211201248L;

	@Override
	public void save(Game g) {
		super.getSessionFactory().getCurrentSession().save(g);
	}

	@Override
	public void saveAll(List<Game> games) {
		for(Game g : games){
			this.save(g);
		}
	}

	@Override
	public void update(Game g) {
		super.getSessionFactory().getCurrentSession().update(g);
	}

	@Override
	public void delete(Game g) {
		super.getSessionFactory().getCurrentSession().delete(g);
	}
	
	@Override
	public Game getGameById(Long idGame) {
		return (Game)
				super.createQuery(QueryConstants.GAME_GET_BY_ID)
					 .setParameter("idGame", idGame)
					 .uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Game> getGamesByMember(Long idPerson) {
		return (List<Game>)
				super.createQuery(QueryConstants.GAME_GET_ALL_WON_GAMES_BY_MEMBER)
				     .setParameter("idPerson", idPerson)
				     .list();
	}

	@Override
	public List<Game> getGamesByMembers(List<Long> idPersons) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> getGamesByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Game> getGamesByTournament(Long idTournament) {
		// TODO Auto-generated method stub
		return null;
	}

}
