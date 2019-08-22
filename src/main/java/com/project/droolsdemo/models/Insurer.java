/**
 * 
 */
package com.project.droolsdemo.models;

/**
 * @author sivasaiv
 *
 */
public class Insurer {

	private  String name;
	
	private  double amount;
	
	private String percentage;

	public Insurer() {
		
	}
	
	public Insurer(String name, double amount,String percentage) {
		super();
		this.name = name;
		this.amount = amount;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

}
