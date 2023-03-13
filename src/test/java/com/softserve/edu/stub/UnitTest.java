package com.softserve.edu.stub;

import com.softserve.edu.dao.IProductDao;
import com.softserve.edu.service.ProductService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {

	@Test
	public void checkLastDigits() {
		IProductDao productDao = new ValidProductDaoStub();
		ProductService productService = new ProductService(productDao);
		String actual;
		String expected;
		//
		expected = "123";
		actual = productService.getLastDigits();
		//
		Assert.assertEquals(actual, expected, "LastDigits ERROR");
	}

	@Test
	public void checkOutDot() {
		IProductDao productDao = new OutDotProductDaoStub();
		ProductService productService = new ProductService(productDao);
		String actual;
		String expected;
		//
		expected = "aaa181";
		actual = productService.getLastDigits();
		//
		Assert.assertEquals(actual, expected, "LastDigits ERROR");
	}

	@Test
	public void checkLastDot() {
		IProductDao productDao = new LastDotProductDaoStub();
		ProductService productService = new ProductService(productDao);
		String actual;
		String expected;
		//
		expected = "";
		actual = productService.getLastDigits();
		//
		Assert.assertEquals(actual, expected, "LastDigits ERROR");
	}

}
