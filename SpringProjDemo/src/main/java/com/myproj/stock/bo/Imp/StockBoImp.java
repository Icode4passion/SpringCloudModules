package com.myproj.stock.bo.Imp;


import com.myproj.stock.bo.StockBo;
import com.myproj.stock.model.Stock;
import com.myproj.stock.dao.StockDao;

public class StockBoImp implements StockBo{
	
	StockDao stockDao;
	
	public void setStockDao(StockDao stockDao) {
		this.stockDao = stockDao;
	}
	
	public void save(Stock stock) {
		stockDao.save(stock);
	}
	
	public void update(Stock stock) {
		stockDao.update(stock);
	}
	
	public void delete(Stock stock) {
		stockDao.delete(stock);
	}
	
	 

	public Stock findStockByCode(String stockCode) {
		
		return stockDao.findStockByCode(stockCode);
	}

	
}
