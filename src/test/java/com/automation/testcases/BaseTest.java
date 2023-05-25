package com.automation.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.acl.Group;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        String platform = "Cloud";

        if (platform.equals("Local")) {
            getLocalDriver();
        } else {
            getCloudDriver();
        }

        driver.get("http://www.google.com");
    }

    public void getCloudDriver() throws MalformedURLException {
        String URL = "https://" + "aelitazheldenova_7yL5RD" + ":" + "hwHfNSAvsP5kwseJNZcU" + "@hub-cloud.browserstack.com/wd/hub";
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");

        URL url = new URL(URL);
        driver = new RemoteWebDriver(url, browserOptions);
    }

    public void getLocalDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void cleanUp() {
        System.out.println("Close browser");
        driver.quit();
    }
}
