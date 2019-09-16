/**
 * 
 */
package com.project.droolsdemo.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.project.droolsdemo.models.CarInsuranceDetails;
import com.project.droolsdemo.models.Insurer;
import com.project.droolsdemo.service.CarInsuranceService;
import com.project.droolsdemo.service.InsuranceService;
import com.project.droolsdemo.service.PropertyInsuranceService;

/**
 * @author sivasaiv
 *
 */
@RestController
public class InsurerController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	InsuranceService service;
	
	@PostMapping("/{insuranceType}/insurers")
	public String getLeadInsurers(@RequestBody String request, @PathVariable String insuranceType) throws JsonParseException, JsonMappingException, IOException {
		logger.info("InsurerController/getLeadInsurers...");
		return service.getLeadInsurers(request, insuranceType);
	}
	
	@PostMapping("/{insuranceType}/insurers/{insurerName}")
	public String  getFollowerInsurers(@RequestBody  String request,@PathVariable String insurerName,@PathVariable String insuranceType) throws JsonParseException, JsonMappingException, IOException{
		logger.info("InsurerController/getFollowerInsurers...");
		return service.getFollowerInsurers(request,insurerName,insuranceType);
	}
}
