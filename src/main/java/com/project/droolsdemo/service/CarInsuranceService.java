/**
 * 
 */
package com.project.droolsdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.droolsdemo.models.CarInsuranceDetails;
import com.project.droolsdemo.models.Insurer;

/**
 * @author sivasaiv
 *
 */
@Service
public class CarInsuranceService {

	@Autowired
	InsuranceProviderService providerService;

	public List<Insurer> getLeadInsurers(CarInsuranceDetails details) {
		return getInsuranceProviders(details, "default");
	}

	public List<Insurer> getFollowerInsurers(CarInsuranceDetails details, String insurerName) {

		return getInsuranceProviders(details, insurerName);
	}

	private List<Insurer> getInsuranceProviders(CarInsuranceDetails details, String groupName) {
		return providerService.insuranceProviders(details, groupName);
	}

}
