/**
 * 
 */
package com.project.droolsdemo.models;

import javax.validation.constraints.NotNull;

/**
 * @author sivasaiv
 *
 */

public class CarInsuranceDetails {

	private int age;
	
	private String gender;
	
	private String maritalStatus;
	
	private int drivingExperience;
	
	@NotNull
    private int	claims;
    
	private int latePayment;
	
	private int previouCoverage;
	
	@NotNull(message = "manufacturedyear cannot be empty")
	private String manufacturedYear;
	
	private String type;
	
	@NotNull
	private String  use;
	
	@NotNull
	private double cost;
	
	private int annualMiles;
	
	@NotNull
	private String city;
	
	@NotNull
	private String profession;
	
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city.toLowerCase();
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession.toLowerCase();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender.toLowerCase();
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus.toLowerCase();
	}

	public int getDrivingExperience() {
		return drivingExperience;
	}

	public void setDrivingExperience(int drivingExperience) {
		this.drivingExperience = drivingExperience;
	}

	public int getClaims() {
		return claims;
	}

	public void setClaims(int claims) {
		this.claims = claims;
	}

	public int getLatePayment() {
		return latePayment;
	}

	public void setLatePayment(int latePayment) {
		this.latePayment = latePayment;
	}

	public int getPreviouCoverage() {
		return previouCoverage;
	}

	public void setPreviouCoverage(int previouCoverage) {
		this.previouCoverage = previouCoverage;
	}

	public String getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(String manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type.toLowerCase();
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use.toLowerCase();
	}

	public int getAnnualMiles() {
		return annualMiles;
	}

	public void setAnnualMiles(int annualMiles) {
		this.annualMiles = annualMiles;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
