/**
 * 
 */
package com.project.droolsdemo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	InsuranceProviderService providerService;

	public List<Insurer> getLeadInsurers(CarInsuranceDetails details) {
		logger.info("CarInsuranceService/getLeadInsurers...");
		return getInsuranceProviders(details, "default");
	}

	public List<Insurer> getFollowerInsurers(CarInsuranceDetails details, String insurerName) {
		logger.info("CarInsuranceService/getFollowerInsurers...");
		return getInsuranceProviders(details, insurerName);
	}

	private List<Insurer> getInsuranceProviders(CarInsuranceDetails details, String groupName) {
		return providerService.insuranceProviders(details, groupName);
	}

}
