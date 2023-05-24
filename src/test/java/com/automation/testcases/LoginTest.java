package com.automation.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest  extends BaseTest{


    @Test(groups = {"SmokeTest", "AelitaTest"})
    public void verifyUserCanLogin() {
        System.out.println("Verify login successful");
    }

    @Test (groups = "AelitaTest")
    public void verifyUserCannotLoginWithInvalidCredentials() {
        System.out.println("Verify login unsuccessful for invalid credentials");
    }

    @Test(groups = "SmokeTest")
    public void verifyUserCanResetPassword() {
        System.out.println("Verify user can reset password");
    }

}
