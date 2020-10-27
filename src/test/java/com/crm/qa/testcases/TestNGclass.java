package com.crm.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGclass {
	@BeforeMethod
	public void before(){
		System.out.println("before");
	}
	@Test 
	public void Test(){
		System.out.println("Test");
	}
	@AfterMethod
	public void After(){
		System.out.println("After");
	}

}
