/**
 * 
 */
package com.project.droolsdemo.service;

import java.util.List;
import java.util.Objects;

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
		
		return getLeadInsures(details);
	}
	
	public List<Insurer> getFollowerInsurers(CarInsuranceDetails details,String insurerName) {
		
		return getFolowerInsurers(details, insurerName);
	}
	
	
	private List<Insurer> getLeadInsures(CarInsuranceDetails details){
		
		return getInsuranceProviders(details, "default");
	}

	private List<Insurer> getInsuranceProviders(CarInsuranceDetails details,String groupName) {
		return providerService.insuranceProviders(details, groupName);
	}

	private boolean isDetailsNull(CarInsuranceDetails details) {
		
		return Objects.isNull(details);
	}
	
	private void sortInsurers(List<Insurer> insuranceProviders) {
		insuranceProviders.sort((Insurer i1,Insurer i2 ) ->  i1.getAmount().compareTo(i2.getAmount()));
	}
	
	private boolean isInsurerExists(List<Insurer> insuranceProviders) {
		
		return !insuranceProviders.isEmpty();
	}
	
	private List<Insurer> getFolowerInsurers(CarInsuranceDetails details,String insurerName){
		return getInsuranceProviders(details, insurerName);
	}
}
