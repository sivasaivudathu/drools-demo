/**
 * 
 */
package com.project.droolsdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.droolsdemo.models.CarInsuranceDetails;
import com.project.droolsdemo.models.Insurer;
import com.project.droolsdemo.propertyinsurance.model.PropertyInsuranceDetails;
import com.project.droolsdemo.propertyinsurance.model.PropertyInsurer;
import com.project.droolsdemo.service.CarInsuranceService;
import com.project.droolsdemo.service.PropertyInsuranceService;

/**
 * @author sivasaiv
 *
 */
@RestController
public class InsurerController {

	@Autowired
	CarInsuranceService insuranceService;
	
	@Autowired
	PropertyInsuranceService propertyInsuanceService;
	
	@PostMapping("/insurers")
	public List<Insurer> getFollowerInsurers(@RequestBody @Valid  CarInsuranceDetails details){
		return insuranceService.getLeadInsurers(details);
	}
	
	@PostMapping("/insurers/{insurerName}")
	public List<Insurer> getFollowerInsurers(@RequestBody @Valid  CarInsuranceDetails details,@PathVariable String insurerName){
		return insuranceService.getFollowerInsurers(details,insurerName);
	}
	
	@PostMapping("/property/insurers")
	public List<PropertyInsurer> getLeadInsurers(@RequestBody @Valid  PropertyInsuranceDetails details){
		return propertyInsuanceService.getLeadInsurers(details);
	}
	
	@PostMapping("/property/insurers/{insurerName}")
	public List<PropertyInsurer> getFollowerInsurers(@RequestBody @Valid  PropertyInsuranceDetails details,@PathVariable String insurerName){
		return propertyInsuanceService.getFollowerInsurers(details,insurerName);
	}
}
