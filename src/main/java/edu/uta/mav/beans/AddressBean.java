package edu.uta.mav.beans;

public class AddressBean {
	private int addressId;
	private String addressType;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private int pincode;
	public AddressBean(){
	}
	public AddressBean(int addressId, String addressType, String address1,
			String address2, String city, String state, String country,
			int pincode) {
		super();
		this.addressId = addressId;
		this.addressType = addressType;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "AddressBean [addressId=" + addressId + ", addressType="
				+ addressType + ", address1=" + address1 + ", address2="
				+ address2 + ", city=" + city + ", State=" + state
				+ ", country=" + country + ", pincode=" + pincode + "]";
	}
	
}
