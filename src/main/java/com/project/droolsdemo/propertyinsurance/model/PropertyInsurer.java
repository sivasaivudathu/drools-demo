/**
 * 
 */
package com.project.droolsdemo.propertyinsurance.model;

import java.io.Serializable;

/**
 * @author sivasaiv
 *
 */
public class PropertyInsurer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private  String name;
	
	private String percentage;

	public PropertyInsurer() {
		
	}
	
	public PropertyInsurer(String name,String percentage) {
		super();
		this.name = name;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Insurer [name=" + name + ", percentage=" + percentage + "]";
	}

}
