package com.usa.practice.testng.code;


import org.testng.AssertJUnit;
//import org.junit.Assert;

import org.testng.annotations.Test;

public class DependsOnAnotherMethods {
	 
		@Test public void setupMethod() {
		 System.out.println("This is setupMethod"); 
		AssertJUnit.assertTrue("Setup method will fail", false);;
		}
		 @Test(dependsOnMethods = { "setupMethod" })
		 public void method2() {
		 System.out.println("This is method 2"); 
		 } 
		} 


