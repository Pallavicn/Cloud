package com.deluxe.testng;

import java.io.IOException;

import org.testng.annotations.Test;

import com.deluxe.common.BaseClass;
import com.deluxe.utils.AutoConstants;
import com.deluxe.utils.PropHandlerz;

public class SampleTestScript extends BaseClass {
  @Test(groups="REG")
  public void openURL() throws IOException {
	  driver.get(PropHandlerz.fetchProp(AutoConstants.URL.URL));
  }
}
