package com.garudaone.business.beans;

import java.util.List;

import javax.sql.DataSource;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import com.garudaone.business.interfaces.SimpleRetrievalInterface;
import com.garudaone.business.model.FutureContractModel;

@Repository
public class SimpleRetrieval implements SimpleRetrievalInterface {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<FutureContractModel> getDataforDate(String date) {
		DateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		List<FutureContractModel> futuresContract = new ArrayList<FutureContractModel>();
		try {
		Date dt = sdf.parse(date);
		System.out.println("The date is " + dt);
		futuresContract = jdbcTemplate.query("SELECT Symbol, tradeDate, openPrice, highPrice, lowPrice, closePrice,Volume,openInterest FROM t_nse_nfo_futures WHERE tradeDate = ?;",new Object[] {dt},
														new BeanPropertyRowMapper(FutureContractModel.class));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		return futuresContract;
	}
	public String getDataforExpiry(String expiry) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDataforUnderlying(String Underlying, String month) {
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

}
