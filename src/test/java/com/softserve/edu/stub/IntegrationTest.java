package com.softserve.edu.stub;

import com.softserve.edu.dao.ProductDao;
import com.softserve.edu.service.ProductService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationTest {

	@Test
	public void checkLastDigits() {
		ProductDao productDao = new ProductDao();
		ProductService productService = new ProductService(productDao);
		String actual;
		String expected;
		//
		expected = "181";
		actual = productService.getLastDigits();
		//
		Assert.assertEquals(actual, expected, "LastDigits ERROR");
	}
	
}
