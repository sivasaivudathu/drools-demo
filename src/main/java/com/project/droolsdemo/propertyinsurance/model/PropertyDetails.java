/**
 * 
 */
package com.project.droolsdemo.propertyinsurance.model;

/**
 * @author sivasaiv
 *
 */
public class PropertyDetails {

	private String ownershipName;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String country;
	
	private String postalCode;

	public String getOwnershipName() {
		return ownershipName;
	}

	public void setOwnershipName(String ownershipName) {
		this.ownershipName = ownershipName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city.toLowerCase();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "PropertyDetails [ownershipName=" + ownershipName + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + ", country=" + country + ", postalCode=" + postalCode + "]";
	}
	
}
