package edu.uta.mav.beans;

public class UserSessionBean {
	private String applicationId;
	private String mavId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String userType;		//student-professor-staff-counselor
	private String acadCareerType;	//GRAD-underGrad
	private String acadCareerNo;	//#
	private String major;			//
	private String admitTerm;		//FALL 2017
	private String userStatus;		//active-inactive
	private String emailId;
	private String applicationNumber;
	
	public UserSessionBean() {
		super();
	}
	public UserSessionBean(String applicationId, String mavId,
			String firstName, String middleName, String lastName,
			String userType, String acadCareerType, String acadCareerNo,
			String major, String admitTerm, String userStatus, String emailId,
			String applicationNumber) {
		super();
		this.applicationId = applicationId;
		this.mavId = mavId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.userType = userType;
		this.acadCareerType = acadCareerType;
		this.acadCareerNo = acadCareerNo;
		this.major = major;
		this.admitTerm = admitTerm;
		this.userStatus = userStatus;
		this.emailId = emailId;
		this.applicationNumber = applicationNumber;
	}



	public String getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}
	public String getMavId() {
		return mavId;
	}
	public void setMavId(String mavId) {
		this.mavId = mavId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getAcadCareerType() {
		return acadCareerType;
	}
	public void setAcadCareerType(String acadCareerType) {
		this.acadCareerType = acadCareerType;
	}
	public String getAcadCareerNo() {
		return acadCareerNo;
	}
	public void setAcadCareerNo(String acadCareerNo) {
		this.acadCareerNo = acadCareerNo;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAdmitTerm() {
		return admitTerm;
	}
	public void setAdmitTerm(String admitTerm) {
		this.admitTerm = admitTerm;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	@Override
	public String toString() {
		return "UserSessionBean [applicationId=" + applicationId + ", mavId="
				+ mavId + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", userType="
				+ userType + ", acadCareerType=" + acadCareerType
				+ ", acadCareerNo=" + acadCareerNo + ", major=" + major
				+ ", admitTerm=" + admitTerm + ", userStatus=" + userStatus
				+ ", emailId=" + emailId + ", applicationNumber="
				+ applicationNumber + "]";
	}
	
}
