package com.softserve.edu.stub;


import com.softserve.edu.dao.IProductDao;

public class ValidProductDaoStub implements IProductDao {

	public String getIPAddress() {
		return "aaa.123";
	}

	public String getIPAddress(String text) {
		return "aaa.123";
	}
}
