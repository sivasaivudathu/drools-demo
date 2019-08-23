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
import com.project.droolsdemo.service.CarInsuranceService;

/**
 * @author sivasaiv
 *
 */
@RestController
public class InsurerController {

	@Autowired
	CarInsuranceService insuranceService;
	
	@PostMapping("/insurers")
	public List<Insurer> getFollowerInsurers(@RequestBody @Valid  CarInsuranceDetails details){
		return insuranceService.getLeadInsurers(details);
	}
	
	@PostMapping("/insurers/{insurerName}")
	public List<Insurer> getFollowerInsurers(@RequestBody @Valid  CarInsuranceDetails details,@PathVariable String insurerName){
		return insuranceService.getFollowerInsurers(details,insurerName);
	}
}
