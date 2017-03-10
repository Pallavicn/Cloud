package com.deluxe.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.deluxe.common.GmailPage;
import com.deluxe.utils.AutoUtils;
import com.deluxe.utils.PropHandlerz;

public class GmailLogin extends Hooks {
  
  @Test(dataProvider = "hardCodedBrowsers")
  public void loginGmailAccount(String browser, String version, String os, Method method) throws InterruptedException, IOException {
	  this.createDriver(browser, version, os, method.getName());
	  WebDriver driver = this.getWebDriver();
	  
	  //Creating GmailPage object to supply driver instance
	  GmailPage objLogin = new GmailPage(driver);
	  
	  //Opening Gmail Login URL
	  driver.get(PropHandlerz.fetchProp("gurl"));
	  AutoUtils.setTimeOut(5000);
	  
	  //Enter Username or email ID in username field
	  objLogin.setUname(PropHandlerz.fetchProp("username"));
	  AutoUtils.setTimeOut(5000);
	  
	  //Click the next button to navigate to password entry field
	  objLogin.clickNextBtn();
	  AutoUtils.setTimeOut(3000);
	  
	  //Enter Password in Password field
	  objLogin.setPassword(PropHandlerz.fetchProp("pwd"));
	  AutoUtils.setTimeOut(3000);
	  
	  //click SignIn button to login to Gmail Page
	  objLogin.submitSignIn();
	  AutoUtils.setTimeOut(3000);
	  
	  
	 
  }
}
