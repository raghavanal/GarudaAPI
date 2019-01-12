package com.garudaone.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.garudaone.business.beans.HealthCheck;

@Configuration
public class BusinessConfig {
	
	@Bean
	public HealthCheck healthCheck()
	{
		return new HealthCheck();
	}
	

}
