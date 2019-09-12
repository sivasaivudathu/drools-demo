/**
 * 
 */
package com.project.droolsdemo.propertyinsurance.model;

/**
 * @author sivasaiv
 *
 */
public class PropertyInsuranceDetails {

	private InsuredDetails insuredDetails;
	
	private PropertyDetails propertyDetails;
	
	private PropertyDescription propertyDescription;

	public InsuredDetails getInsuredDetails() {
		return insuredDetails;
	}

	public void setInsuredDetails(InsuredDetails insuredDetails) {
		this.insuredDetails = insuredDetails;
	}

	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}

	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public PropertyDescription getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(PropertyDescription propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	@Override
	public String toString() {
		return "PropertyInsuranceDetails [insuredDetails=" + insuredDetails + ", propertyDetails=" + propertyDetails
				+ ", propertyDescription=" + propertyDescription + "]";
	}
	
}
