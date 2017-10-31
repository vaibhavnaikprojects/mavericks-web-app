package edu.uta.mav.beans;

public class LicenseBean {
	private int licenceId;
	private String licence;
	private String country;
	private String state;
	private String issueDate;
	private String expiryDate;
	public LicenseBean(){
	}
	public LicenseBean(int licenceId, String licence, String country,
			String state, String issueDate, String expiryDate) {
		super();
		this.licenceId = licenceId;
		this.licence = licence;
		this.country = country;
		this.state = state;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}
	public int getLicenceId() {
		return licenceId;
	}
	public void setLicenceId(int licenceId) {
		this.licenceId = licenceId;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "LicenseBean [licenceId=" + licenceId + ", licence=" + licence
				+ ", country=" + country + ", state=" + state + ", issueDate="
				+ issueDate + ", expiryDate=" + expiryDate + "]";
	}
	
}
