package com.myproj.stock.dao;

import com.myproj.stock.model.Stock;

public interface StockDao {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findStockByCode(String stockCode);
	
	
}
