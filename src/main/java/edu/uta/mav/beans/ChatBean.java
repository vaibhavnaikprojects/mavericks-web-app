package edu.uta.mav.beans;

import org.springframework.stereotype.Component;

@Component
public class ChatBean {
	private long chatId;
	private String messager;
	private String lastMessage;
	private String unreadMessagesCount;
	private String dateTime;
	public ChatBean(){
	}
	public ChatBean(long chatId, String messager, String lastMessage,
			String unreadMessagesCount, String dateTime) {
		super();
		this.chatId = chatId;
		this.messager = messager;
		this.lastMessage = lastMessage;
		this.unreadMessagesCount = unreadMessagesCount;
		this.dateTime = dateTime;
	}
	public long getChatId() {
		return chatId;
	}
	public void setChatId(long chatId) {
		this.chatId = chatId;
	}
	public String getMessager() {
		return messager;
	}
	public void setMessager(String messager) {
		this.messager = messager;
	}
	public String getLastMessage() {
		return lastMessage;
	}
	public void setLastMessage(String lastMessage) {
		this.lastMessage = lastMessage;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getUnreadMessagesCount() {
		return unreadMessagesCount;
	}
	public void setUnreadMessagesCount(String unreadMessagesCount) {
		this.unreadMessagesCount = unreadMessagesCount;
	}
	@Override
	public String toString() {
		return "ChatBean [chatId=" + chatId + ", messager=" + messager
				+ ", lastMessage=" + lastMessage + ", unreadMessagesCount="
				+ unreadMessagesCount + ", dateTime=" + dateTime + "]";
	}
}
