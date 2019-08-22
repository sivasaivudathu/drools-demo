/**
 * 
 */
package com.project.droolsdemo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.droolsdemo.models.CarInsuranceDetails;
import com.project.droolsdemo.models.Insurer;

/**
 * @author sivasaiv
 *
 */
@Service
public class InsuranceProviderService {

	@Autowired
	private KieContainer kContainer;

	public List<Insurer> insuranceProviders(CarInsuranceDetails details) {
		
		List<Insurer> insurerList = new ArrayList<>();
		
		KieSession kieSession = kContainer.newKieSession();
		//kieSession.setGlobal("insurer", new Insurer());
		kieSession.insert(insurerList);
		kieSession.insert(details);
		kieSession.fireAllRules();
		kieSession.dispose();
		System.out.println("No. of Insurance Providers :"+insurerList.size());
		return insurerList;
	}
}
