package com.automation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleDependencyPriority {
    @Test(priority = 0)
    public void test1 () {
        System.out.println("Test1");

    }

    @Test
    public void test2 () {
        System.out.println("Test2");
    }

    @Test(priority = -2)
    public void test3 () {
        System.out.println("Test3");
    }

    @Test
    public void test4 () {
        System.out.println("Test4");
    }

    @Test(priority = - 1, dependsOnMethods = "test4")
    public void test5 () {
        System.out.println("Test5");
    }
}
