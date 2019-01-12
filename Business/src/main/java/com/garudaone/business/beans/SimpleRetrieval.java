package com.garudaone.business.beans;

import org.springframework.stereotype.Component;

import com.garudaone.business.interfaces.SimpleRetrievalInterface;

@Component
public class SimpleRetrieval implements SimpleRetrievalInterface {

	public String getDataforDate(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDataforSymbol(String symbol, String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDataforSymbol(String symbol, String fromDate, String toDate, String Expiry) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDataforExpiry(String expiry) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDataforUnderlying(String Underlying, String month) {
		// TODO Auto-generated method stub
		return null;
	}

}
