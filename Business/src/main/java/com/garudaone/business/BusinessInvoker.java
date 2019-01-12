package com.garudaone.business;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.garudaone.business.beans.HealthCheck;

public class BusinessInvoker {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BusinessConfig.class);
		HealthCheck check = context.getBean(HealthCheck.class);
		String hcheck = check.getHealthCheck();
		System.out.println(hcheck);
		context.close();
	}

}
