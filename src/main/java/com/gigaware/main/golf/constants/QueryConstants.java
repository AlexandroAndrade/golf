package com.gigaware.main.golf.constants;

public final class QueryConstants {
	
	/**
	 * Query Person Constants
	 */
	
	/* Get All Persons */
	public static final String PERSON_GET_ALL = 
			"FROM Person";
	
	/* Get All Members*/
	public static final String MEMBER_GET_ALL =
			"FROM Member";
	
	
	/* Get Branch By Id */
	public static final String BRANCH_GET_BY_ID =
			"FROM Branch b WHERE b.idBranch = :idBranch";
	
}
