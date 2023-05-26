package com.automation.testcases;

import com.ebay.LoginFeature;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

    LoginFeature loginFeature = new LoginFeature();

    @Test(dataProvider =  "invalidData")
    public void verifyLoginUnsuccessfulWithInvalidCredentials (String username, String password) {
        // Testing the method with Test Data
        boolean result = loginFeature.doLogin(username, password);
        // Checking the output
        Assert.assertEquals(result, false);
    }

    @DataProvider(name = "invalidData")
    public Object [][] getData () {
        String [][] credentials = {
                {"admin", "admin123"},
                {"admin123", "admin"},
                {"chirag", "admin123"},
                {"admin", "devx@123"},
                {"", ""},
                {"", "admin123"},
                {"admin", "admin@123"},

        };
        return credentials;
    }
    @Test
    public void verifyLoginSuccessfulWithValidCredentials () {

    }
}
