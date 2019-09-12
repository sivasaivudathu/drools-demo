/**
 * 
 */
package com.project.droolsdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.droolsdemo.propertyinsurance.model.PropertyInsuranceDetails;
import com.project.droolsdemo.propertyinsurance.model.PropertyInsurer;

/**
 * @author sivasaiv
 *
 */
@Service
public class PropertyInsuranceService {

	@Autowired
	PropertyInsuranceProviderService providerService;

	public List<PropertyInsurer> getLeadInsurers(PropertyInsuranceDetails details) {
		return getInsuranceProviders(details, "default");
	}

	public List<PropertyInsurer> getFollowerInsurers(PropertyInsuranceDetails details, String insurerName) {

		return getInsuranceProviders(details, insurerName);
	}

	private List<PropertyInsurer> getInsuranceProviders(PropertyInsuranceDetails details, String groupName) {
		return providerService.insuranceProviders(details, groupName);
	}

}
