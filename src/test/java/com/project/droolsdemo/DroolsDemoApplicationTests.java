package com.project.droolsdemo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.droolsdemo.models.CarInsuranceDetails;
import com.project.droolsdemo.models.Insurer;
import com.project.droolsdemo.service.InsuranceProviderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DroolsDemoApplicationTests {

	@Autowired
	InsuranceProviderService service;

	@Test
	public void getInsuranceproiders() {

		CarInsuranceDetails details = new CarInsuranceDetails();
		details.setManufacturedYear("2010");
		details.setCost(500000);
		details.setClaims(2);
		details.setUse("personal");

		List<Insurer> result = service.insuranceProviders(details, "default");
		System.out.println(result.size());

		result.forEach(insurer -> {
			System.out.println(insurer.getName() + " : " + insurer.getAmount() + " : " + insurer.getPercentage());
		});

		/*
		 * List<Insurer> result2 = service.insuranceProviders(details,"Bajaj Allianz");
		 * 
		 * result2.forEach(insurer -> { System.out.println(insurer.getName()+" : "+
		 * insurer.getAmount()+" : "+insurer.getPercentage()); });
		 */

	}
}
