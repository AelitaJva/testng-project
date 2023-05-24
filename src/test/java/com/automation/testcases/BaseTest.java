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
    public void setUp()  throws  MalformedURLException{
        driver = getCloudDriver();
        driver.get("http://www.google.com");
    }

    public WebDriver getCloudDriver () throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-nyc.aelita-16dbb");
        sauceOptions.put("accessKey", "76523000-2b12-4606-aeed-ba7d0fb486f7");
        sauceOptions.put("build", "myBuild");
        sauceOptions.put("name", "Chrome Browser Parallel Execution,");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-nyc.aelita-16dbb:76523000-2b12-4606-aeed-ba7d0fb486f7@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        WebDriver driver = new RemoteWebDriver(url, browserOptions);

        return driver;
    }

    public WebDriver getLocalDriver () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    @AfterMethod
    public void cleanUp() {
        System.out.println("Close browser");
        driver.quit();
    }
}
