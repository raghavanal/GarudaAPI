package com.garudaone.business.interfaces;

import org.springframework.stereotype.Component;

@Component
public interface SimpleRetrievalInterface {
	public String getDataforDate(String date);
	public String getDataforSymbol(String symbol, String fromDate, String toDate);
	public String getDataforSymbol(String symbol, String fromDate, String toDate, String Expiry);
	public String getDataforExpiry(String expiry);
	public String getDataforUnderlying(String Underlying,String month);
}
