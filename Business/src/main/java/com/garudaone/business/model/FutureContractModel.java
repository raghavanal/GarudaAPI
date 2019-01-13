package com.garudaone.business.model;

import java.time.LocalDate;

public class FutureContractModel {
	
	 private String symbol;
	    private LocalDate tradeDate;
	    private Double openPrice;
	    private Double closePrice;
	    private Double highPrice;
	    private Double lowPrice;
	    private int Volume;
	    private int openInterest;
		public String getSymbol() {
			return symbol;
		}
		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}
		public LocalDate getTradeDate() {
			return tradeDate;
		}
		public void setTradeDate(LocalDate tradeDate) {
			this.tradeDate = tradeDate;
		}
		public Double getOpenPrice() {
			return openPrice;
		}
		public void setOpenPrice(Double openPrice) {
			this.openPrice = openPrice;
		}
		public Double getClosePrice() {
			return closePrice;
		}
		public void setClosePrice(Double closePrice) {
			this.closePrice = closePrice;
		}
		public Double getHighPrice() {
			return highPrice;
		}
		public void setHighPrice(Double highPrice) {
			this.highPrice = highPrice;
		}
		public Double getLowPrice() {
			return lowPrice;
		}
		public void setLowPrice(Double lowPrice) {
			this.lowPrice = lowPrice;
		}
		public int getVolume() {
			return Volume;
		}
		public void setVolume(int volume) {
			Volume = volume;
		}
		public int getOpenInterest() {
			return openInterest;
		}
		public void setOpenInterest(int openInterest) {
			this.openInterest = openInterest;
		}

	    
		public String settoJson()
		{
			return "{name = " + this.symbol + ",tradeDate = " + this.tradeDate + ", open =" + this.openPrice + ", close = " + this.closePrice
									  + ", high = " + this.highPrice + ",low = "+ this.lowPrice + ", volume =" + this.Volume + ", openInterest = "+ this.openInterest +"}";
		}
	    
}
