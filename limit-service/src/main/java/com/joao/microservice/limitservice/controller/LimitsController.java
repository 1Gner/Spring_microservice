package com.joao.microservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joao.microservice.limitservice.bean.Limits;
import com.joao.microservice.limitservice.configuration.Configuration;

@RestController
public class LimitsController{

	
	@Autowired
	private Configuration configuration;
	
	@GetMapping(value = "/limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
		
	}
	
}
