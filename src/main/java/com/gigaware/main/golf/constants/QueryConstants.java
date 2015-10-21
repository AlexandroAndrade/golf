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
			"FROM Member M WHERE M.idMember = :idMember";

	
	/* Get Branch By Id */
	public static final String BRANCH_GET_BY_ID =
			"FROM Branch b WHERE b.idBranch = :idBranch";

	/* Get All Branches  */
	public static final String BRANCH_GET_ALL =
			"FROM Branch ";
	
	/* Get All Holes */
	public static final String HOLE_GET_ALL = 
			"FROM Hole";
	
	/* Get Hole by Id */
	public static final String HOLE_GET_BY_ID =
			"FROM Hole H WHERE H.idHole = :idHole";
	
	/* Get All Users */
	public static final String USER_GET_ALL = 
			"FROM User";

	/* Get By Id */
	public static final String USER_GET_BY_NICK_NAME = 
			"FROM User U WHERE U.nickName = :nickName";

	/* Get By Id */
	public static final String USER_GET_BY_NICK_NAME_AND_PASSWORD= 
			"FROM User U WHERE U.nickname = :nickName " + 
			"AND u.password = :password";

}
