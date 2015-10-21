/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.main.golf.constants;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
public final class QueryConstants {

	/* Get All Generic */
	public static final String T_GET_ALL =
			"FROM ";
	
	/* Get All Persons */
	public static final String PERSON_GET_ALL = 
			"FROM Person";
	
	/* Get All Members*/
	public static final String MEMBER_GET_ALL =
			"FROM Member";

	/* Get Member by Id*/
	public static final String MEMBER_GET_BY_ID =
			"FROM Member M WHERE M.idPerson = :idPerson";

	
	/* Get Branch By Id */
	public static final String BRANCH_GET_BY_ID =
			"FROM Branch b WHERE b.idBranch = :idBranch";

	/* Get All Branches  */
	public static final String BRANCH_GET_ALL =
			"FROM Branch ";

	/* Get Games by Winner Member */
	public static final String GAME_GET_ALL_WON_GAMES_BY_MEMBER =
			"FROM Game G WHERE G.member.idPerson = :idPerson";

	/* Get Games by Winner Member */
	public static final String GAME_GET_BY_ID =
			"FROM Game G WHERE G.idGame = :idGame";

	/* Get Games by Many Winner Members */
	public static final String GAME_GET_ALL_WON_GAMES_BY_MANY_WINNER_MEMBERS =
			"FROM Game G WHERE G.member.idPerson in (:idPersons)";

	/* Get Game Details by Many Winner Members */
	public static final String GAME_DETAILS_GET_BY_GAME=
			"SELECT GD FROM GameDetails GD "
			+ "JOIN GD.game G "
			+ "WHERE GD.game.idGame = :idGame "
			+ "AND GD.game.idGame = G.idGame";

	/* Get All Holes */
	public static final String HOLE_GET_ALL = 
			"FROM Hole H WHERE H.branch.idBranch = :idBranch";
	
	/* Get Hole by Id */
	public static final String HOLE_GET_BY_ID =
			"FROM Hole H WHERE H.idHole = :idHole";

	/* Get Total Hits of By Branch*/
	public static final String HOLE_GET_TOTAL_HITS_BY_BRANCH =
			"SELECT SUM(H.par) FROM Hole H "
		+   "WHERE H.branch.idBranch = :idBranch";

	/* Get All Users */
	public static final String USER_GET_ALL = 
			"FROM User";

	/* Get User by Nick Name */
	public static final String USER_GET_BY_NICK_NAME = 
			"FROM User U WHERE U.nickName = :nickName";

	/* Get User by NickName and Password*/
	public static final String USER_GET_BY_NICK_NAME_AND_PASSWORD= 
			"FROM User U WHERE U.nickname = :nickName " + 
			"AND u.password = :password";

}
