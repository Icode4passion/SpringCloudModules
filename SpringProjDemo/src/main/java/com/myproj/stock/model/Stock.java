package com.myproj.stock.model;

import java.io.Serializable;

public class Stock implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long stockId;
	private String stockCode;
	private String stockName;
	public long getStockId() {
		return stockId;
	}
	public void setStockId(long stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	
	

}
