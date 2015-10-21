/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.dao;

import java.util.Date;
import java.util.List;

import com.gigaware.main.golf.dao.factory.GenericDao;
import com.gigaware.main.golf.entity.Game;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public interface GameDao extends GenericDao<Game> {
	
	Game getGameById(final Long idGame);
	List<Game> getGamesByMember(final Long idPerson);
	List<Game> getGamesByMembers(final List<Long> idPersons);
	List<Game> getGamesByDate(final Date date);
	List<Game> getGamesByTournament(final Long idTournament);
	
}
