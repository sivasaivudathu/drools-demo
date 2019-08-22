package com.project.droolsdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.droolsdemo.models.CarInsuranceDetails;
import com.project.droolsdemo.models.Fare;
import com.project.droolsdemo.models.Insurer;
import com.project.droolsdemo.models.TaxiRide;
import com.project.droolsdemo.service.InsuranceProviderService;
import com.project.droolsdemo.service.TaxiFareCalculatorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DroolsDemoApplicationTests {

	 @Autowired
	    private TaxiFareCalculatorService taxiFareCalculatorService;
	 
	 @Autowired
	 InsuranceProviderService service;

	    @Test
	    public void whenNightSurchargeFalseAndDistanceLessThan10_thenFixFareWithoutNightSurcharge() {
	        TaxiRide taxiRide = new TaxiRide();
	        taxiRide.setIsNightSurcharge(false);
	        taxiRide.setDistanceInMile(9L);
	        Fare rideFare = new Fare();
	        Long totalCharge = taxiFareCalculatorService.calculateFare(taxiRide, rideFare);

	        assertNotNull(totalCharge);
	        assertEquals(Long.valueOf(70), totalCharge);
	    }
	    
	    @Test
	    public void getInsuranceproiders() {
	    	
	    	CarInsuranceDetails details = new CarInsuranceDetails();
	    	details.setManufacturedYear("1999");
	    	details.setCost(500000);
	    	details.setClaims(6);
	    	details.setUse("personal");
	    	
	    	List<Insurer> result = service.insuranceProviders(details);
	    	System.out.println(result.size());
	    
	    	result.forEach(insurer -> {
	    		System.out.println(insurer.getName()+" : "+ insurer.getAmount());
	    	});
	    }

}
