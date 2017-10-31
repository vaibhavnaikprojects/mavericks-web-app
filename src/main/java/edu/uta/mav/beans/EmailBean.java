package edu.uta.mav.beans;

public class EmailBean {
	private int emailId;
	private String emailType;
	private String email;
	private boolean preferred;
	public EmailBean(){
	}
	public EmailBean(int emailId, String emailType, String email,
			boolean preferred) {
		super();
		this.emailId = emailId;
		this.emailType = emailType;
		this.email = email;
		this.preferred = preferred;
	}
	public int getEmailId() {
		return emailId;
	}
	public void setEmailId(int emailId) {
		this.emailId = emailId;
	}
	public String getEmailType() {
		return emailType;
	}
	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getPreferred() {
		return preferred;
	}
	public void setPreferred(boolean preferred) {
		this.preferred = preferred;
	}
	@Override
	public String toString() {
		return "EmailBean [emailId=" + emailId + ", emailType=" + emailType
				+ ", email=" + email + ", preferred=" + preferred + "]";
	}
	

}
