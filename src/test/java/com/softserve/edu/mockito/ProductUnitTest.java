package com.softserve.edu.mockito;

import com.softserve.edu.dao.IProductDao;
import com.softserve.edu.dao.ProductDao;
import com.softserve.edu.service.ProductService;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockObjectFactory;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.Assert;
import org.testng.IObjectFactory;
import org.testng.ITestObjectFactory;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;

//@PrepareForTest({ ProductDao.class, ProductService.class })
@PrepareForTest(ProductService.class)
public class ProductUnitTest { // extends PowerMockTestCase {

    @ObjectFactory
    public IObjectFactory setObjectFactory() {
    //public ITestObjectFactory setObjectFactory() {
        return new PowerMockObjectFactory();
    }

    //@Test
    public void checkMockito() throws Exception {
        IProductDao productDao = Mockito.mock(ProductDao.class); // = Mockito.mock(IProductDao.class)
        Mockito.when(productDao.getIPAddress()).thenReturn(".123");
        ProductService productService = new ProductService(productDao);
        //
        String actual;
        String expected;
        //
        expected = "123";
        actual = productService.getLastDigits();
        //
        Assert.assertEquals(actual, expected, "LastDigits ERROR");
    }

    //@Test
    public void checkSpy() throws Exception {
        IProductDao productDao = Mockito.spy(new ProductDao());
        Mockito.when(productDao.getIPAddress()).thenReturn(".123");
        Mockito.doCallRealMethod().when(productDao).getIPAddress("");
        ProductService productService = new ProductService(productDao);
        //
        String actual;
        String expected;
        //
        expected = "123";
        actual = productService.getLastDigits();
        //
        Assert.assertEquals(actual, expected, "LastDigits ERROR");
        //
        expected = "181";
        actual = productService.getLastDigits("");
        //
        Assert.assertEquals(actual, expected, "LastDigits ERROR");
    }

    //@Test
    public void checkPowerMockito() throws Exception {
        IProductDao productDao = PowerMockito.mock(IProductDao.class);
        PowerMockito.when(productDao.getIPAddress(Mockito.anyString())).thenReturn(".123");
        ProductService productService = new ProductService(productDao);
        //
        String actual;
        String expected;
        //
        expected = "123";
        actual = productService.getLastDigits("test");
        //
        Assert.assertEquals(actual, expected, "LastDigits ERROR");
    }

    @Test
    public void checkConstructor() throws Exception {
        ProductDao productDao = PowerMockito.mock(ProductDao.class);
        PowerMockito.when(productDao.getIPAddress()).thenReturn(".123");
        //
        PowerMockito.whenNew(ProductDao.class).withNoArguments().thenReturn(productDao);
        ProductService productService = new ProductService();
        //
        String actual;
        String expected;
        //
        expected = "123";
        actual = productService.getLastDigits();
        //
        Assert.assertEquals(actual, expected, "LastDigits ERROR");
    }

}