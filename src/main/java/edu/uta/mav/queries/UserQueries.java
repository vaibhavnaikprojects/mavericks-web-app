package edu.uta.mav.queries;

public class UserQueries {
	public static final String GET_USER = "select * from tbl_users where userId=? and status='active'";
	public static final String GET_USERS = "select * from tbl_users where status='active'";
	public static final String USER_SEARCH_BY_GENDER = "select * from tbl_users where status='active' and gender=?";
	public static final String USER_SEARCH_BY_CAMPUS_LOCATION = "select * from tbl_users where status='active' and campusLocation=?";
	public static final String USER_SEARCH_BY_LOCATION = "select * from tbl_users where status='active' and homeTown=?";
	public static final String USER_SEARCH_BY_MAJOR = "select * from tbl_users where status='active' and firstMajor=?";
	public static final String USER_SEARCH_BY_NAME = "select * from tbl_users where status='active' and userName like ?";
	public static final String USER_SEARCH_BY_TYPE = "select * from tbl_users where status='active' and userType=?";
	public static final String GET_SESSION_USER = "SELECT applicationId,tbl_users.mavId,firstName,middleName,lastName,userType,acadCareerType,"+
       " acadCareerNo,major,admitTerm,userStatus,(select email from tbl_email,tbl_email_type where mavId=?"+
       " and tbl_email_type.emailTypeId=tbl_email.emailTypeId"+
       " and tbl_email_type.emailType='UTA') emailId,applicationNumber"+
       " FROM tbl_users"+
       " where"+
       " tbl_users.mavId=? and userStatus='active'";
	public static final String GET_HOLD_ITEMS = "SELECT itemId,holdItem,institution,startTerm,endTerm,startDate,endDate,departmentName,amount FROM tbl_holditems,tbl_dapartment where mavId=? and tbl_dapartment.departmentId=tbl_holditems.departmentId";
	public static final String GET_TODO_ITEMS = "SELECT * FROM tbl_todo where mavId=?";
}
