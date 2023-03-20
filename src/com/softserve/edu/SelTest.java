package com.softserve.edu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SelTest {
    private final Long IMPLICITLY_WAIT_SECONDS = 10L;

    @Test
    public void checkMac() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        //
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        //
        //WebDriver driver = new ChromeDriver();
        //
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT_SECONDS)); // 0 by default
        driver.manage().window().maximize();
        //
        driver.get("http://taqc-opencart.epizy.com/");
        Thread.sleep(2000); // For Presentation
        //
        driver.findElement(By.name("search")).sendKeys("mac");
        Thread.sleep(2000); // For Presentation
        //
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
        //
        Thread.sleep(8000); // For Presentation
        driver.quit();
        //
        Assert.assertTrue(true);
        System.out.println("\ndone");
    }

}
