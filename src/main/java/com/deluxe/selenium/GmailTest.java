package com.deluxe.selenium;

import com.deluxe.common.BaseClass;



public class GmailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
     //Open the browser and load URL
     BaseClass.openBrowser("Firefox");
     //BaseClass.openURL("http:\\gmail.com");
     
     //Close the browser post transaction is complete
     BaseClass.closeBrowser();
     
	}

}
