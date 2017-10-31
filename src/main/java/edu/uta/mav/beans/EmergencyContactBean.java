package edu.uta.mav.beans;

public class EmergencyContactBean {
	private int contactId;
	private String contactName;
	private String realtionshipType;
	private String phone;
	private String ext;
	private String countryCode;
	private AddressBean address;
	public EmergencyContactBean(){
	}
	public EmergencyContactBean(int contactId, String contactName,
			String realtionshipType, String phone, String ext, String countryCode,
			AddressBean address) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.realtionshipType = realtionshipType;
		this.phone = phone;
		this.ext = ext;
		this.countryCode = countryCode;
		this.address = address;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getRealtionshipType() {
		return realtionshipType;
	}
	public void setRealtionshipType(String realtionshipType) {
		this.realtionshipType = realtionshipType;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmergencyContactBean [contactId=" + contactId
				+ ", contactName=" + contactName + ", realtionshipType="
				+ realtionshipType + ", phone=" + phone + ", ext=" + ext
				+ ", countryCode=" + countryCode + ", address=" + address + "]";
	}
}
