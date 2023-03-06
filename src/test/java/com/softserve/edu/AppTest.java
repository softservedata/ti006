package com.softserve.edu;

//import org.testng.Assert;
//import org.testng.annotations.Test;

//import org.junit.Assert;
//import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp1() {
        System.out.println("class AppTest: testApp1()");
        Assertions.assertTrue(true);
    }

    @Test
    public void testApp2() {
        System.out.println("class AppTest: testApp2()");
        Assertions.assertTrue(true);
    }
}
