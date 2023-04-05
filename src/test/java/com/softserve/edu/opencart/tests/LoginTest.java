package com.softserve.edu.opencart.tests;

import com.softserve.edu.opencart.data.IUser;
import com.softserve.edu.opencart.data.UserRepository;
import com.softserve.edu.opencart.pages.EditAccountPage;
import com.softserve.edu.opencart.pages.HomePage;
import com.softserve.edu.opencart.pages.UnsuccessfulLoginPage;
import com.softserve.edu.opencart.tools.ListUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//public class LoginTest extends TestRunnerFirst {
public class LoginTest extends TestRunnerFirst {

    /*
    @DataProvider//(parallel = true)
    public Object[][] dataSuccessful() {
        return new Object[][] {
            { "xdknxusqvjeovowpfk@awdrt.com", "awdrt123", "my" },
            { "hahaha@gmail.com", "qwerty", "hahaha" },
        };
    }
    */

    /*
    @DataProvider//(parallel = true)
    public Object[][] dataSuccessful() {
        return new Object[][] {
                { UserRepository.get().getHahaha() },
                { UserRepository.get().getAwdrt() },
        };
    }
    */

    @DataProvider//(parallel = true)
    public Object[][] dataSuccessful() {
        //return ListUtils.toMultiArray(UserRepository.get().fromCsv());
        return ListUtils.toMultiArray(UserRepository.get().fromExcel());
    }

    @Test(dataProvider = "dataSuccessful")
    //public void checkSuccessful(String email, String password, String firstName) {
    public void checkSuccessful(IUser validUser) {
        //
        // Steps
        EditAccountPage editAccountPage = loadApplication()
                .gotoLoginPage()
                //.successfulLogin(email, password)
                .successfulLogin(validUser)
                .gotoEditAccountRight();
        presentationSleep();
        //
        // Check
        //Assert.assertEquals(editAccountPage.getFirstNameFieldText(), firstName);
        Assert.assertEquals(editAccountPage.getFirstNameFieldText(), validUser.getFirstname());
        //
        // Return to Previous State
        HomePage homePage = editAccountPage
                .gotoContinue() // optional
                .gotoLogoutRight()
                .gotoContinue();
        //
        // Check
        Assert.assertTrue(homePage
                .getSlideshow0FirstImageAttributeSrcText()
                .contains(HomePage.EXPECTED_IPHONE6));
        presentationSleep();
    }

    /*
    @DataProvider//(parallel = true)
    public Object[][] dataUnsuccessful() {
        return new Object[][] {
                { "xdknx@awdrt.com", "aw123" },
                { "hah@gmail.com", "qwy" },
        };
    }
    */

    // /*
    @DataProvider//(parallel = true)
    public Object[][] dataUnsuccessful() {
        return new Object[][] {
                { UserRepository.get().getInvalidUser() },
        };
    }
    // */

    @Test(dataProvider = "dataUnsuccessful")
    //public void checkUnsuccessful(String emailInvalid, String passwordInvalid) {
    public void checkUnsuccessful(IUser invalidUser) {
        //
        // Steps
        UnsuccessfulLoginPage unsuccessfulLoginPage = loadApplication()
                .gotoLoginPage()
                //.unsuccessfulLoginPage(emailInvalid, passwordInvalid);
                .unsuccessfulLoginPage(invalidUser);
        presentationSleep();
        //
        // Check
        Assert.assertTrue(unsuccessfulLoginPage.getAlertWarningText()
                .contains(UnsuccessfulLoginPage.EXPECTED_LOGIN_MESSAGE));
        //
        // Return to Previous State
        HomePage homePage = unsuccessfulLoginPage
                .gotoHomePage();
        //
        // Check
        Assert.assertTrue(homePage
                .getSlideshow0FirstImageAttributeSrcText()
                .contains(HomePage.EXPECTED_IPHONE6));
        presentationSleep();
    }

    //@Test
    public void checkHome() {
        // Steps
        HomePage homePage = loadApplication();
        presentationSleep();
        //
        // Check
        Assert.assertEquals(homePage.getSlideshow0FirstImageAttributeAltText(), HomePage.EXPECTED_IPHONE_6);
        Assert.assertTrue(homePage.getSlideshow0FirstImageAttributeSrcText().contains(HomePage.EXPECTED_IPHONE6));
    }
}
