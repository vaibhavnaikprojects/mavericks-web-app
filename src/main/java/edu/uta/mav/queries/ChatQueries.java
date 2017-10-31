package edu.uta.mav.queries;

public class ChatQueries {

	public static final String GET_CHATS_BY_USERID = "select * from chats where userId=?";
	public static final String DELETE_CHAT = "delete from chats where chatId=?";
	public static final String GET_MESSAGE_BY_CHATID = "select * from messages where chatId=?";
	public static final String DELETE_MESSAGE = "delete from messages where messageId=?";
	public static final String ADD_CHAT = null;
	public static final String ADD_MESSAGE = null;

}
