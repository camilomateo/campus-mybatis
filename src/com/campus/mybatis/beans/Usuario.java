package com.campus.mybatis.beans;

public class Usuario {
	
	private String id;
	private String userName;
	private String lastName;
	private String firstName;
	private String title;
	private String phoneHome;
	private String phoneMobile;
	private String phoneWork;
	private String phoneOther;
	private String phoneFax;
	private String addressStreet;
	private String addressCity;
	private String addressState;
	private String addressCountry;
	private String addressPostalcode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPhoneHome() {
		return phoneHome;
	}

	public void setPhoneHome(String phoneHome) {
		this.phoneHome = phoneHome;
	}

	public String getPhoneMobile() {
		return phoneMobile;
	}

	public void setPhoneMobile(String phoneMobile) {
		this.phoneMobile = phoneMobile;
	}

	public String getPhoneWork() {
		return phoneWork;
	}

	public void setPhoneWork(String phoneWork) {
		this.phoneWork = phoneWork;
	}

	public String getPhoneOther() {
		return phoneOther;
	}

	public void setPhoneOther(String phoneOther) {
		this.phoneOther = phoneOther;
	}

	public String getPhoneFax() {
		return phoneFax;
	}

	public void setPhoneFax(String phoneFax) {
		this.phoneFax = phoneFax;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public String getAddressPostalcode() {
		return addressPostalcode;
	}

	public void setAddressPostalcode(String addressPostalcode) {
		this.addressPostalcode = addressPostalcode;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", userName=" + userName + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", title=" + title + ", phoneHome=" + phoneHome + ", phoneMobile=" + phoneMobile + ", phoneWork="
				+ phoneWork + ", phoneOther=" + phoneOther + ", phoneFax=" + phoneFax + ", addressStreet="
				+ addressStreet + ", addressCity=" + addressCity + ", addressState=" + addressState
				+ ", addressCountry=" + addressCountry + ", addressPostalcode=" + addressPostalcode + "]";
	}
	
}
