package com.softserve.edu.stub;

import com.softserve.edu.dao.IProductDao;
import com.softserve.edu.service.ProductService;

public class Appl {

	public static void main(String[] args) {
		IProductDao userDao = new OutDotProductDaoStub();
		ProductService productService = new ProductService(userDao);
		System.out.println("result = " + productService.getLastDigits());
	}
}
