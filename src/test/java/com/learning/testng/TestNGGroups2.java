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

public class TestNGGroups2 {
	
	@BeforeSuite(alwaysRun=true)
	public void beforeSuite()
	{
		System.out.println("This will get executed before the complete Test suite");
	}
	
	
	
	
	
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod()
	{
		System.out.println("This will get executed before each @Test method");
	}
	
	
	@Test (groups= {"smoke"})
	public void testCase4()
	{
		System.out.println("Test case 4");
	}
	
	@Test(groups= {"sanity"})
	public void testCase5()
	{
		System.out.println("Test case 5");
	}
	
	
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod()
	{
		System.out.println("This will get executed after each @Test method");
	}
	
	
	

	
	@AfterSuite(alwaysRun=true)
	public void afterSuite()
	{
		System.out.println("This will get executed after the complete Test suite");
	}

}


/*
 * 
 * ------------
 * 1 Test suite
 * 2 Tests (Sanity, smoke)
 * 3 classs
 * 10 @Test
 * ----------------
 * 
 * 
 * 1 Test suite
 * sanity test
 * 3 class
 * 8 Test
 * 
 smoke Test
 * 2 class
 * 10 @Test
 * 
 */

