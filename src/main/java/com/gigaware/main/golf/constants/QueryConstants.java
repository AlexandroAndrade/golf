package com.gigaware.main.golf.constants;

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

}
