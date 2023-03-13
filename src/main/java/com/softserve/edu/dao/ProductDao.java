package com.softserve.edu.dao;

public class ProductDao implements IProductDao {

	public String getIPAddress() {
		System.out.println("***Running ProductDao getIPAddress()");
		return "192.168.103.181";
	}

	public String getIPAddress(String text) {
		System.out.println("***Running ProductDao getIPAddress(String text)");
		return "192.168.103.181" + text;
	}

}
