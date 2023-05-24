package com.automation.testcases;

import org.testng.annotations.Test;

public class SearchFunctionalityTest extends BaseTest {
    @Test(groups = "SmokeTest")
    public void verifySearchResultAreDisplayed () {
        System.out.println("Verify search result");
    }

    @Test(groups = "BekjanTest")
    public void verifyMessageWhenThereAreNoResult () {
        System.out.println("Verify no result message");
    }

    @Test(groups = "BekjanTest")
    public void verifySearchResultHasSearchKeyword () {
        System.out.println("Verify search result has search keyword");
    }
}
