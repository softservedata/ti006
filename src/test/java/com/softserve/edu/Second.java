package com.softserve.edu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Second {

    @Test
    public void checkApp() {
        System.out.println("class Second: checkApp()");
        Assert.assertTrue(true);
    }
}
