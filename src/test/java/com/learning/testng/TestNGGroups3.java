package com.learning.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Ctrl+Shift+f - Key for Intendation


public class TestNGGroups3 {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This will get executed before the complete Test suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This will get executed before each Test case group");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This will get executed before all the test cases in that specific class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This will get executed before each @Test method");
	}
	
	
	@Test (groups= {"sanity"})
	public void testCase001()
	{
		System.out.println("Test case 001");
	}
	
	
	@Test (groups= {"smoke"})
	public void testCase002()
	{
		System.out.println("Test case 002");
	}
	@Test(groups= {"smoke"})
	public void testCase003()
	{
		System.out.println("Test case 003");
	}
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This will get executed after each @Test method");
	}
	
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This will get executed before all the test cases in that specific class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This will get executed after each Test case group");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This will get executed after the complete Test suite");
	}

}

	
	

