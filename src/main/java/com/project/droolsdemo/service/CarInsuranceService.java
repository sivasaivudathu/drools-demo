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
		return getInsuranceProviders(details,"default");
	}
	
	public List<Insurer> getFollowerInsurers(CarInsuranceDetails details,String insurerName) {
		
		return getInsuranceProviders(details, insurerName);
	}
	
	public List<Insurer> getDynamicLeadInsures(CarInsuranceDetails details){
		
		return getDynamicInsuranceProviders(details, "default");
	}
	
	public List<Insurer> getDynamicFollowerInsurers(CarInsuranceDetails details,String insurerName) {
		
		return getDynamicInsuranceProviders(details, insurerName);
	}
	
	private List<Insurer> getInsuranceProviders(CarInsuranceDetails details,String groupName) {
		return providerService.insuranceProviders(details, groupName);
	}
	
	private List<Insurer> getDynamicInsuranceProviders(CarInsuranceDetails details,String groupName) {
		return providerService.dynamicInsuranceProviders(details, groupName);
	}
}
