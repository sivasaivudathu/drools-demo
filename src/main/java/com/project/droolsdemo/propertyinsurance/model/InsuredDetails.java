/**
 * 
 */
package com.project.droolsdemo.propertyinsurance.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author sivasaiv
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InsuredDetails {

	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String emailId;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Override
	public String toString() {
		return "InsuredDetails [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + "]";
	}
}
