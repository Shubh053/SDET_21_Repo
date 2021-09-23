package com.comcast.org;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups="SmokeTest")
	public void createOrgTest() {
		System.out.println("org created");
	}
	
	@Test(groups="RegressionTest")
	public void createOrgWithIndustryTest() {
		System.out.println("org with industry created");
	}
	
	@Test(groups="RegressionTest")
	public void deleteOrgTest() {
		System.out.println("Org deleted");
	}
}
