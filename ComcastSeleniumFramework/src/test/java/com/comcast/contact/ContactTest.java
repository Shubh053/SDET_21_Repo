package com.comcast.contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="SmokeTest")
	public void createContactTest() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println("===>" + URL);
		System.out.println("===>" + BROWSER);
		System.out.println("contact created");
	}
	
	@Test(groups="RegressionTest")
	public void createContactWithOrgTest() {
		System.out.println("contact created with organization");
	}
	
	@Test(groups="RegressionTest")
	public void deleteContactTest() {
		System.out.println("contact is deleted");
	}
}
