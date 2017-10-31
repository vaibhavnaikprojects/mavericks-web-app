package edu.uta.mav.beans;

public class NINBean {
	private int nationalId;
	private String country;
	private String ninType;
	private String ninNumber;
	public NINBean() {	
	}
	public NINBean(int nationalId, String country, String ninType,
			String ninNumber) {
		super();
		this.nationalId = nationalId;
		this.country = country;
		this.ninType = ninType;
		this.ninNumber = ninNumber;
	}
	public int getNationalId() {
		return nationalId;
	}
	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNinType() {
		return ninType;
	}
	public void setNinType(String ninType) {
		this.ninType = ninType;
	}
	public String getNinNumber() {
		return ninNumber;
	}
	public void setNinNumber(String ninNumber) {
		this.ninNumber = ninNumber;
	}
	@Override
	public String toString() {
		return "NINBean [nationalId=" + nationalId + ", country=" + country
				+ ", ninType=" + ninType + ", ninNumber=" + ninNumber + "]";
	}
	
	
}
