package com.softserve.edu.opencart.tests;

import com.softserve.edu.opencart.data.Currencies;
import com.softserve.edu.opencart.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CurrencyTest extends TestRunnerFirst {

    @DataProvider//(parallel = true)
    public Object[][] searchCurrencies() {
        return new Object[][] { 
            { Currencies.EURO },
            { Currencies.US_DOLLAR },
            //{ Currencies.POUND_STERLING },
            //{ Currencies.US_DOLLAR, "$" },
        };
    }
    
    @Test(dataProvider = "searchCurrencies")
    public void checkFirst(Currencies currency) {
    //public void checkFirst(Currencies currency, String currencySymbol) {
    //public void checkFirst() {
        //
        // Steps
        HomePage homePage = loadApplication()
                //.chooseCurrency("US Dollar");
                //.chooseCurrency("Eur0");
                //.chooseCurrency(Currencies.EURO);
                .chooseCurrency(currency);
                //.scrollToProduct(searchProduct.getProduct());
        presentationSleep();
        //
        // Check
        //Assert.assertTrue(homePage.getCurrencyText().contains("€"));
        //Assert.assertTrue(homePage.getCurrencyText().contains("$"));
        //Assert.assertTrue(homePage.getCurrencyText().contains(currencySymbol));
        Assert.assertTrue(homePage.getCurrencyText().contains(currency.getSymbol()));
        //
        presentationSleep(4);
    }
}