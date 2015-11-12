/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.dao;

import java.util.List;

import com.gigaware.golf.dao.factory.GenericDao;
import com.gigaware.golf.entity.GameDetails;

/**
 * @author alex andrade yngwie_alex@hotmail.com
 */
public interface GameDetailsDao extends GenericDao<GameDetails> {

    List<GameDetails> getGameDetailsByGame( final Long idGame );
    List<GameDetails> getGameDetailsByMemberAndGame( final Long idPerson, final Long idGame );

}
