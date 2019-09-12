/**
 * 
 */
package com.project.droolsdemo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.droolsdemo.models.CarInsuranceDetails;
import com.project.droolsdemo.models.Insurer;
import com.project.droolsdemo.propertyinsurance.model.PropertyInsuranceDetails;
import com.project.droolsdemo.propertyinsurance.model.PropertyInsurer;

/**
 * @author sivasaiv
 *
 */
@Service
public class InsuranceService {

	@Autowired
	CarInsuranceService carInsuranceService;
	
	@Autowired
	PropertyInsuranceService propertyInsuranceService;
	
	
	public String getLeadInsurers(String request,String insuranceType) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		String result ;
		
		if(insuranceType.equalsIgnoreCase("vehicle")) {
			List<Insurer> insurers = carInsuranceService.getLeadInsurers(mapper.readValue(request, CarInsuranceDetails.class));
			result = mapper.writeValueAsString(insurers);
		}else if (insuranceType.equalsIgnoreCase("property")) {
			List<PropertyInsurer> propertyInsurers = propertyInsuranceService.getLeadInsurers(mapper.readValue(request, PropertyInsuranceDetails.class));
			result = mapper.writeValueAsString(propertyInsurers);
		}else {
			result = "Unsupported Insurance Type";
		}
		return result;
	}
	
public String getFollowerInsurers(String request,String insurerName,String insuranceType) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		String result ;
		
		if(insuranceType.equalsIgnoreCase("vehicle")) {
			List<Insurer> insurers = carInsuranceService.getFollowerInsurers(mapper.readValue(request, CarInsuranceDetails.class),insurerName);
			result = mapper.writeValueAsString(insurers);
		}else if (insuranceType.equalsIgnoreCase("property")) {
			List<PropertyInsurer> propertyInsurers = propertyInsuranceService.getFollowerInsurers(mapper.readValue(request, PropertyInsuranceDetails.class),insurerName);
			result = mapper.writeValueAsString(propertyInsurers);
		}else {
			result = "Unsupported Insurance Type";
		}
		return result;
	}
}
