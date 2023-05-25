package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertHardAssert {
    @Test
    public void testSoftAssert () {

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(2, 2);
        softAssert.assertEquals("Aelita", "Aelta");
        softAssert.assertEquals(10, 10);
        softAssert.assertEquals("Test", "Tet");
        softAssert.assertEquals("Devx", "Dev");
        softAssert.assertEquals(true, true);
        softAssert.assertAll();
        System.out.println("Soft Assert Test Ends");
    }

    @Test
    public void testHardAssert () {
        Assert.assertEquals(2, 2);
        Assert.assertEquals("Aelita", "Aelta");
        Assert.assertEquals(10, 10);
        Assert.assertEquals("Test", "Test");
        Assert.assertEquals("Devx", "Devx");
        Assert.assertEquals(true, true);
        System.out.println("Hard Assert Test Ends");
    }
}
