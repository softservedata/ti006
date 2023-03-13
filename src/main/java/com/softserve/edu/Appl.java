package com.softserve.edu;

import com.softserve.edu.dao.ProductDao;
import com.softserve.edu.service.ProductService;

public class Appl {

	public static void main(String[] args) {
		ProductService productService = new ProductService(new ProductDao());
		System.out.println("result = " + productService.getLastDigits());
	}
}
