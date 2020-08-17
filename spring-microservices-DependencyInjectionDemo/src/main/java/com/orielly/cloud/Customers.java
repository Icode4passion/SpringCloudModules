package com.orielly.cloud;

import org.springframework.stereotype.Component;
@Component

public class Customers {
	private int id;
	private String Ename;
	private String EDes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEDes() {
		return EDes;
	}
	public void setEDes(String eDes) {
		EDes = eDes;
	}
	
	
	
	

}
