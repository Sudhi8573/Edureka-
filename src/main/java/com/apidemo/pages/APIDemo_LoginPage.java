package com.apidemo.pages;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.apidemo.object.APIDemo_OLogin;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class APIDemo_LoginPage {
	
	AndroidDriver<AndroidElement> driver;
	APIDemo_OLogin objlogin;
	Properties prop;
	
	public APIDemo_LoginPage(AndroidDriver<AndroidElement> driver) throws IOException {
		
		this.driver = driver;
		objlogin = new APIDemo_OLogin(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void apilogin() {
		
		objlogin.preferences().click();
		
	}

}
