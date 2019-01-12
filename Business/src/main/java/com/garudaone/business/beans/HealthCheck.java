package com.garudaone.business.beans;

import org.springframework.stereotype.Component;

@Component
public class HealthCheck {
		
	private String healthcheck;

		
	public String getHealthCheck()
	{
		this.healthcheck = "******* Application is Up and Running *******";
		return this.healthcheck;
	}
}
