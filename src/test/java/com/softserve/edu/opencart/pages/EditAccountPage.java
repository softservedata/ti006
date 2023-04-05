package com.softserve.edu.opencart.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditAccountPage extends AccountSidebarLoggedPart {

    private WebElement firstNameField;
    private WebElement continueButton;

    //public EditAccountPage(WebDriver driver) {
    public EditAccountPage() {
        //super(driver);
        initElements();
    }

    private void initElements() {
        // init elements
//        firstNameField = driver.findElement(By.name("firstname"));
//        continueButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
        //
        firstNameField = search.name("firstname");
        continueButton = search.cssSelector("input.btn.btn-primary");
    }

    // Page Object

    // firstNameField
    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public String getFirstNameFieldText() {
        return getFirstNameField().getAttribute(TAG_ATTRIBUTE_VALUE);
    }

    public void clearFirstNameField() {
        getFirstNameField().clear();
    }

    public void clickFirstNameField() {
        getFirstNameField().click();
    }

    public void setFirstNameField(String text) {
        getFirstNameField().sendKeys(text);
    }

    // continueButton
    public WebElement getContinueButton() {
        return continueButton;
    }

    public String getContinueButtonText() {
        return getContinueButton().getAttribute(TAG_ATTRIBUTE_VALUE);
    }

    public void clickContinueButton() {
        getContinueButton().click();
    }

    // Functional

    // Business Logic

    @Step("STEP GOTO CONTINUE")
    public MyAccountPage gotoContinue() {
        clickContinueButton();
        //return new MyAccountPage(driver);
        return new MyAccountPage();
    }

}
