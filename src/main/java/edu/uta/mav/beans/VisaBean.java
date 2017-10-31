package edu.uta.mav.beans;

public class VisaBean {
	private int visaId;
	private String visaType;
	private String visa;
	private String country;
	public VisaBean(){
	}
	public VisaBean(int visaId, String visaType, String visa,
			String country) {
		super();
		this.visaId = visaId;
		this.visaType = visaType;
		this.visa = visa;
		this.country = country;
	}
	public int getVisaId() {
		return visaId;
	}
	public void setVisaId(int visaId) {
		this.visaId = visaId;
	}
	public String getVisaType() {
		return visaType;
	}
	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}
	public String getVisa() {
		return visa;
	}
	public void setVisa(String visa) {
		this.visa = visa;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "VisaBean [visaId=" + visaId + ", visaType=" + visaType
				+ ", visa=" + visa + ", country=" + country + "]";
	}
}
