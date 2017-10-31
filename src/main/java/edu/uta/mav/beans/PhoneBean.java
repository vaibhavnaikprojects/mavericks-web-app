package edu.uta.mav.beans;

public class PhoneBean {
	private int phoneId;
	private String phoneType;
	private String telephone;
	private String ext;
	private String country;
	private boolean preferred;
	public PhoneBean(){
	}
	public PhoneBean(int phoneId, String phoneType, String telephone,
			String ext, String country, boolean preferred) {
		super();
		this.phoneId = phoneId;
		this.phoneType = phoneType;
		this.telephone = telephone;
		this.ext = ext;
		this.country = country;
		this.preferred = preferred;
	}
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean getPreferred() {
		return preferred;
	}
	public void setPreferred(boolean preferred) {
		this.preferred = preferred;
	}
	@Override
	public String toString() {
		return "PhoneBean [phoneId=" + phoneId + ", phoneType=" + phoneType
				+ ", telephone=" + telephone + ", ext=" + ext + ", country="
				+ country + ", preferred=" + preferred + "]";
	}
	
}
