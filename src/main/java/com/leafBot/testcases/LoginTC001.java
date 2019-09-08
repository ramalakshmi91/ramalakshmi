package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.leafBot.pages.Loginleaf;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginTC001 extends ProjectSpecificMethods{
	
	@BeforeTest 
	public void setData()
	{
		excelFileName="TC001";
		testcaseName="TC001"; 
		testcaseDec="TC001";
		author="rama"; 
		category="smoke";
	}
	@Test(dataProvider="fetchData")
			public void runTC001(String username,String password)
			{
		
		new Loginleaf().enterUserName(username).enterPassword(password).clickLogin();
		
			}

}
