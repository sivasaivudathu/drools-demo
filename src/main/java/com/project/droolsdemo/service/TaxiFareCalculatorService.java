/**
 * 
 */
package com.project.droolsdemo.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.droolsdemo.models.Fare;
import com.project.droolsdemo.models.TaxiRide;

/**
 * @author sivasaiv
 *
 */
@Service
public class TaxiFareCalculatorService {

	@Autowired
	private KieContainer kContainer;

	public Long calculateFare(TaxiRide taxiRide, Fare rideFare) {
		KieSession kieSession = kContainer.newKieSession();
		kieSession.setGlobal("rideFare", rideFare);
		kieSession.insert(false);
		kieSession.insert(taxiRide);
		kieSession.fireAllRules();
		kieSession.dispose();
		System.out.println("!! RIDE FARE !! " + rideFare.getTotalFare());
		return rideFare.getTotalFare();
	}
}
