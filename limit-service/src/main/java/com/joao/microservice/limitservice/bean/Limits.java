package com.joao.microservice.limitservice.bean;

public class Limits {
	private Integer minimum;
	private Integer maximum;
	
	
	
	
	
	
	
	public Limits() {
	}
	
	
	
	public Limits(Integer minimum, Integer maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}



	public Integer getminimum() {
		return minimum;
	}
	public void setminimum(Integer minimum) {
		this.minimum = minimum;
	}
	public Integer getmaximum() {
		return maximum;
	}
	public void setmaximum(Integer maximum) {
		this.maximum = maximum;
	}
	
	
}
