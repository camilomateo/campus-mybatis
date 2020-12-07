package com.campus.mybatis.beans;

import java.util.*;

public class Contacto {

	private String id;
	private String description;
	private Integer deleted;
	private String idUsuario;
	private String salutation;
	private String firstName;
	private String lastName;
	private String title;
	private String department;
	private String phoneHome;
	private String phoneMobile;
	private String phoneWork;
	private String phoneOther;
	private String phoneFax;
	private String primaryAddressStreet;
	private String primaryAddressCity;
	private String primaryAddressState;
	private String primaryAddressPostalcode;
	private String primaryAddressCountry;
	private String altAddressStreet;
	private String altAddressCity;
	private String altAddressState;
	private String altAddressPostalcode;
	private String altAddressCountry;
	private String assistant;
	private String assistantPhone;
	private String leadSource;
	private Date birthDate;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public String getPrimaryAddressStreet() {
		return primaryAddressStreet;
	}

	public void setPrimaryAddressStreet(String primaryAddressStreet) {
		this.primaryAddressStreet = primaryAddressStreet;
	}

	public String getPrimaryAddressCity() {
		return primaryAddressCity;
	}

	public void setPrimaryAddressCity(String primaryAddressCity) {
		this.primaryAddressCity = primaryAddressCity;
	}

	public String getPrimaryAddressState() {
		return primaryAddressState;
	}

	public void setPrimaryAddressState(String primaryAddressState) {
		this.primaryAddressState = primaryAddressState;
	}

	public String getPrimaryAddressPostalcode() {
		return primaryAddressPostalcode;
	}

	public void setPrimaryAddressPostalcode(String primaryAddressPostalcode) {
		this.primaryAddressPostalcode = primaryAddressPostalcode;
	}

	public String getPrimaryAddressCountry() {
		return primaryAddressCountry;
	}

	public void setPrimaryAddressCountry(String primaryAddressCountry) {
		this.primaryAddressCountry = primaryAddressCountry;
	}

	public String getAltAddressStreet() {
		return altAddressStreet;
	}

	public void setAltAddressStreet(String altAddressStreet) {
		this.altAddressStreet = altAddressStreet;
	}

	public String getAltAddressCity() {
		return altAddressCity;
	}

	public void setAltAddressCity(String altAddressCity) {
		this.altAddressCity = altAddressCity;
	}

	public String getAltAddressState() {
		return altAddressState;
	}

	public void setAltAddressState(String altAddressState) {
		this.altAddressState = altAddressState;
	}

	public String getAltAddressPostalcode() {
		return altAddressPostalcode;
	}

	public void setAltAddressPostalcode(String altAddressPostalcode) {
		this.altAddressPostalcode = altAddressPostalcode;
	}

	public String getAltAddressCountry() {
		return altAddressCountry;
	}

	public void setAltAddressCountry(String altAddressCountry) {
		this.altAddressCountry = altAddressCountry;
	}

	public String getAssistant() {
		return assistant;
	}

	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public String getAssistantPhone() {
		return assistantPhone;
	}

	public void setAssistantPhone(String assistantPhone) {
		this.assistantPhone = assistantPhone;
	}

	public String getLeadSource() {
		return leadSource;
	}

	public void setLeadSource(String lead_source) {
		this.leadSource = lead_source;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", description=" + description + ", deleted=" + deleted + ", idUsuario="
				+ idUsuario + ", salutation=" + salutation + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", title=" + title + ", department=" + department + ", phoneHome=" + phoneHome + ", phoneMobile="
				+ phoneMobile + ", phoneWork=" + phoneWork + ", phoneOther=" + phoneOther + ", phoneFax=" + phoneFax
				+ ", primaryAddressStreet=" + primaryAddressStreet + ", primaryAddressCity=" + primaryAddressCity
				+ ", primaryAddressState=" + primaryAddressState + ", primaryAddressPostalcode="
				+ primaryAddressPostalcode + ", primaryAddressCountry=" + primaryAddressCountry + ", altAddressStreet="
				+ altAddressStreet + ", altAddressCity=" + altAddressCity + ", altAddressState=" + altAddressState
				+ ", altAddressPostalcode=" + altAddressPostalcode + ", altAddressCountry=" + altAddressCountry
				+ ", assistant=" + assistant + ", assistandPhone=" + assistantPhone + ", leadSource=" + leadSource
				+ ", birthDate=" + birthDate + "]";
	}
	
}
