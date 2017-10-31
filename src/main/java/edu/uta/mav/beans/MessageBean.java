package edu.uta.mav.beans;

import org.springframework.stereotype.Component;

@Component
public class MessageBean {
	private long messageId;
	private String message;
	private String messageBy;
	private String messageTo;
	private String time;
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessageBy() {
		return messageBy;
	}
	public void setMessageBy(String messageBy) {
		this.messageBy = messageBy;
	}
	public String getMessageTo() {
		return messageTo;
	}
	public void setMessageTo(String messageTo) {
		this.messageTo = messageTo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "MessageBean [messageId=" + messageId + ", message=" + message
				+ ", messageBy=" + messageBy + ", messageTo=" + messageTo
				+ ", time=" + time + "]";
	}
}
