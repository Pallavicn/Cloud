package com.deluxe.tests;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.deluxe.utils.AutoConstants;
import com.deluxe.utils.PropHandlerz;

public class SampleTest extends Hooks {
  
  @Test(dataProvider = "hardCodedBrowsers")
  public void openGmailUrl(String browser, String version, String os, Method method) throws IOException {
	  this.createDriver(browser, version, os, method.getName());
      WebDriver driver = this.getWebDriver(); 
      
      // Open selenium official site..
	  driver.get(PropHandlerz.fetchProp(AutoConstants.URL.URL));
  }
}
