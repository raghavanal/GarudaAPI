package com.garudaone.business.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;

import com.garudaone.business.model.FutureContractModel;

@Component
public interface SimpleRetrievalInterface {
	public List<FutureContractModel> getDataforDate(String date);
	public String getDataforSymbol(String symbol, String fromDate, String toDate);
	public String getDataforSymbol(String symbol, String fromDate, String toDate, String Expiry);
	public String getDataforExpiry(String expiry);
	public String getDataforUnderlying(String Underlying,String month);
}
