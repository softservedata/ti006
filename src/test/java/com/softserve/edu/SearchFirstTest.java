package com.softserve.edu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchFirstTest {
    private static final String BASE_URL = "http://taqc-opencart.epizy.com/";
    private static final Long IMPLICITLY_WAIT_SECONDS = 10L;
    private static final Long ONE_SECOND_DELAY = 1000L;

    private void presentationSleep() {
        presentationSleep(1);
    }

    private void presentationSleep(int seconds) {
        try {
            Thread.sleep(seconds * ONE_SECOND_DELAY); // For Presentation ONLY
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void checkMac() {
        //System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        //System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        //
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new ChromeDriver();
        //
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT_SECONDS)); // 0 by default
        //driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
        //driver.manage( ).timeouts( ).pageLoadTimeout(100, SECONDS);
        //driver.manage( ).timeouts().setScriptTimeout(100, SECONDS);
        //
        driver.manage().window().maximize();
        presentationSleep(); // For Presentation ONLY
        //
        driver.get(BASE_URL);
        presentationSleep(); // For Presentation ONLY
        //
        // Choose Curency
        driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle")).click();
        presentationSleep(); // For Presentation ONLY
        //
        //driver.findElement(By.cssSelector("button[name='USD']")).click();
        driver.findElement(By.name("USD")).click();
        presentationSleep(); // For Presentation ONLY
        //
        // Steps
        //driver.findElement(By.cssSelector("#search > input")).click();
        driver.findElement(By.name("search")).click();
        //driver.findElement(By.cssSelector("#search > input")).clear();
        driver.findElement(By.name("search")).clear();
        //driver.findElement(By.cssSelector("#search > input")).sendKeys("mac");
//        driver.findElement(By.name("search")).sendKeys("mac");
        driver.findElement(By.name("search")).sendKeys("mac", Keys.ENTER);
        presentationSleep(); // For Presentation ONLY
        //
//        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
//        presentationSleep(); // For Presentation ONLY
        //
        // Check
        WebElement price = driver.findElement(By.xpath("//a[text()='MacBook']/../following-sibling::p[@class='price']"));
        Assert.assertTrue(price.getText().contains("$602.00"));
        System.out.println("***contains: " + price.getText());
        presentationSleep(); // For Presentation ONLY
        //
        //driver.close(); // close browser
        driver.quit(); // close browser, stop server
    }
}