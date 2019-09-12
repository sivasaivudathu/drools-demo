/**
 * 
 */
package com.project.droolsdemo.service;

import java.util.ArrayList;
import java.util.List;


import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.droolsdemo.propertyinsurance.model.PropertyInsurer;
import com.project.droolsdemo.propertyinsurance.model.PropertyInsuranceDetails;

/**
 * @author sivasaiv
 *
 */
@Service
public class PropertyInsuranceProviderService {

	@Autowired
	@Qualifier("propertyinsurance-container")
	KieContainer kieContainer;
	
	public List<PropertyInsurer> insuranceProviders(PropertyInsuranceDetails details, String groupName) {

		List<PropertyInsurer> insurerList = new ArrayList<>();

		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(insurerList);
		kieSession.insert(details);
		kieSession.getAgenda().getAgendaGroup(groupName).setFocus();
		kieSession.fireAllRules();
		kieSession.dispose();
		return insurerList;
	}
}
