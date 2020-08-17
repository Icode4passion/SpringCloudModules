package com.myproj.stock.bo;


import com.myproj.stock.model.Stock;

public interface StockBo {
	
	
	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findStockByCode(String stockCode);
	 

}
