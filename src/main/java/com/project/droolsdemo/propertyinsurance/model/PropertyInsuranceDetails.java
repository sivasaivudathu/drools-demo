/**
 * 
 */
package com.project.droolsdemo.propertyinsurance.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sivasaiv
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PropertyInsuranceDetails {
    
	@JsonProperty("InsuredDetails")
	private InsuredDetails insuredDetails;
	
	@JsonProperty("PropertyDetails")
	private PropertyDetails propertyDetails;
	
	@JsonProperty("PropertyDescription")
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
