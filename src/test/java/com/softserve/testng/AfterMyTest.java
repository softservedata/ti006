package com.softserve.testng;

import org.testng.annotations.*;

public class AfterMyTest {

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("\t@AfterTest");
    }

    @AfterClass(alwaysRun = true)
    //@@AfterClass
    public void afterClass() {
        System.out.println("\t\t@AfterClass");
        //throw new RuntimeException("error");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\t@AfterMethod");
        throw new RuntimeException("error");
    }

    @Test
    public void method1() {
        System.out.println("\t\t\t\t@Test method1()");
        //throw new RuntimeException("error");
    }
}
