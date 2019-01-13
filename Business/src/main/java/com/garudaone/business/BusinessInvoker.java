package com.garudaone.business;

import java.util.List;
import java.util.ListIterator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.garudaone.business.beans.HealthCheck;
import com.garudaone.business.beans.SimpleRetrieval;
import com.garudaone.business.model.FutureContractModel;

public class BusinessInvoker {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BusinessConfig.class);
		HealthCheck check = context.getBean(HealthCheck.class);
		String hcheck = check.getHealthCheck();
		System.out.println(hcheck);
		SimpleRetrieval retrieve = context.getBean(SimpleRetrieval.class);
		List<FutureContractModel> mod = retrieve.getDataforDate("20181025");
		ListIterator<FutureContractModel> iterator = mod.listIterator();
		String jsonArray = "";
		while(iterator.hasNext())
		{
			FutureContractModel modjson = new FutureContractModel();
			modjson = iterator.next();
			if (jsonArray.length() == 0)
				jsonArray =  modjson.settoJson();
			else
			jsonArray = jsonArray + ","+ modjson.settoJson();
		}
		System.out.println("[ "+ jsonArray+ " ]");
		context.close();
	}

}
