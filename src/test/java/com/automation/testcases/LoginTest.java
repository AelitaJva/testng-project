package com.automation.testcases;

import com.beust.jcommander.Parameter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest  extends BaseTest{


    @Test(groups = {"SmokeTest", "AelitaTest"})
    @Parameters("browser")
    public void verifyUserCanLogin(String browser) {

        System.out.println("Verify login successful");
        System.out.println("Opening browser: " + browser);
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
