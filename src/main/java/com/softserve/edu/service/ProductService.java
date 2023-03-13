package com.softserve.edu.service;

import com.softserve.edu.dao.IProductDao;
import com.softserve.edu.dao.ProductDao;

public class ProductService {

	private IProductDao productDao; // Dependency Inversion

	public ProductService(IProductDao productDao) {  // Dependency Injection
		System.out.println("Constructor ProductService(IProductDao productDao)");
		this.productDao = productDao; 
	}

	public ProductService() {
		System.out.println("Constructor ProductService()");
		productDao = new ProductDao();
	}

	public IProductDao getProductDao() {
		return productDao;
	}

	public String getLastDigits() {
		String origin = getProductDao().getIPAddress();
		return origin.substring(origin.lastIndexOf(".") + 1);
	}

	public String getLastDigits(String text) {
		String origin = getProductDao().getIPAddress(text);
		return origin.substring(origin.lastIndexOf(".") + 1);
	}

}
