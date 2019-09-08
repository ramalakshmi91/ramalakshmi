package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.selenium.api.base.SeleniumBase;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class Loginleaf extends ProjectSpecificMethods {
	public Loginleaf() {
		PageFactory.initElements(driver, this);
		}
@FindBy(id="username") WebElement eleUsername;
@CacheLookup
@FindBy(id="password") WebElement elePassword;
@FindBy(className="decorativeSubmit") WebElement eleLogin;
public Loginleaf enterUserName(String username) {
	clearAndType(eleUsername,username ) ;
	return this;
}
public Loginleaf enterPassword(String password)
{
	clearAndType(elePassword, password);
	return this;
}
public HomePage clickLogin() {
	click(eleLogin);
	return new HomePage();
}
}
	


 
	


	


	
	
	


