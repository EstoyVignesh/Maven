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

public class TestNGAnnotations1 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite Test Case will get executed once before @Test");	
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("");
	}
	

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("");
	}
	
	
	@Test(priority=2)
	public void testCase_1()
	{
		System.out.println("Test Cases 1 will run");	
		
	}
	
	@Test(priority=1)
	public void testCase_2()
	{
		System.out.println("Test Cases 2 will run");	
		
	}
	
	@Test(enabled=false)
	public void testCase_3()
	{
		System.out.println("Test Cases 3 will run");	
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("");
	}
	
		
	@AfterTest
	public void afterTest()
	{
		System.out.println("");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite Test Case will get executed once after @Test");	
		
	}
	

}
