package edu.uta.mav.beans;

import org.springframework.stereotype.Component;

@Component
public class UserBean extends UserSessionBean{
	private String aboutMe;
	private String gender;
	private String homeTown;
	private String dob;
	private String birthCountry;
	private String birthState;
	private String maritalStatus;
	private String militaryStatus;
	private String campusLocation;

	private String twitterURL;
	private String instagramURL;
	private String facebookURL;

	private String fcmToken;
	public UserBean(){
	}

	public UserBean(String applicationId, String mavId, String firstName,
			String middleName, String lastName, String userType,
			String acadCareerType, String acadCareerNo, String major,
			String admitTerm, String userStatus, String emailId,String applicationNumber,String aboutMe, String gender, String homeTown, String dob,
			String birthCountry, String birthState, String maritalStatus,
			String militaryStatus, String campusLocation, String twitterURL,
			String instagramURL, String facebookURL, String fcmToken) {
		super(applicationId, mavId, firstName, middleName, lastName, userType,
				acadCareerType, acadCareerNo, major, admitTerm, userStatus, emailId,applicationNumber);
		this.aboutMe = aboutMe;
		this.gender = gender;
		this.homeTown = homeTown;
		this.dob = dob;
		this.birthCountry = birthCountry;
		this.birthState = birthState;
		this.maritalStatus = maritalStatus;
		this.militaryStatus = militaryStatus;
		this.campusLocation = campusLocation;
		this.twitterURL = twitterURL;
		this.instagramURL = instagramURL;
		this.facebookURL = facebookURL;
		this.fcmToken = fcmToken;
	}



	public UserBean(String aboutMe, String gender, String homeTown, String dob,
			String birthCountry, String birthState, String maritalStatus,
			String militaryStatus, String campusLocation, String twitterURL,
			String instagramURL, String facebookURL, String fcmToken) {
		super();
		this.aboutMe = aboutMe;
		this.gender = gender;
		this.homeTown = homeTown;
		this.dob = dob;
		this.birthCountry = birthCountry;
		this.birthState = birthState;
		this.maritalStatus = maritalStatus;
		this.militaryStatus = militaryStatus;
		this.campusLocation = campusLocation;
		this.twitterURL = twitterURL;
		this.instagramURL = instagramURL;
		this.facebookURL = facebookURL;
		this.fcmToken = fcmToken;
	}

	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getBirthCountry() {
		return birthCountry;
	}
	public void setBirthCountry(String birthCountry) {
		this.birthCountry = birthCountry;
	}
	public String getBirthState() {
		return birthState;
	}
	public void setBirthState(String birthState) {
		this.birthState = birthState;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getMilitaryStatus() {
		return militaryStatus;
	}
	public void setMilitaryStatus(String militaryStatus) {
		this.militaryStatus = militaryStatus;
	}
	public String getCampusLocation() {
		return campusLocation;
	}
	public void setCampusLocation(String campusLocation) {
		this.campusLocation = campusLocation;
	}
	public String getTwitterURL() {
		return twitterURL;
	}
	public void setTwitterURL(String twitterURL) {
		this.twitterURL = twitterURL;
	}
	public String getInstagramURL() {
		return instagramURL;
	}
	public void setInstagramURL(String instagramURL) {
		this.instagramURL = instagramURL;
	}
	public String getFacebookURL() {
		return facebookURL;
	}
	public void setFacebookURL(String facebookURL) {
		this.facebookURL = facebookURL;
	}
	public String getFcmToken() {
		return fcmToken;
	}
	public void setFcmToken(String fcmToken) {
		this.fcmToken = fcmToken;
	}
	@Override
	public String toString() {
		return "UserBean [aboutMe=" + aboutMe + ", gender=" + gender
				+ ", homeTown=" + homeTown + ", dob=" + dob + ", birthCountry="
				+ birthCountry + ", birthState=" + birthState
				+ ", maritalStatus=" + maritalStatus + ", militaryStatus="
				+ militaryStatus + ", campusLocation=" + campusLocation
				+ ", twitterURL=" + twitterURL + ", instagramURL="
				+ instagramURL + ", facebookURL=" + facebookURL + ", fcmToken="
				+ fcmToken + "]";
	}


}
