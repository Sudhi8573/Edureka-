package com.apidemo.pages;

import java.util.concurrent.TimeUnit;

import com.apidemo.object.APIDemo_OPreference;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class APIDemo_PreferencePage {
	
	AndroidDriver<AndroidElement> driver;
	APIDemo_OPreference opref;
	
	public APIDemo_PreferencePage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		opref = new APIDemo_OPreference(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void preferncePage() throws InterruptedException {
		
		opref.dependencies().click();
		opref.checkbox().click();
		opref.wifisettings().click();
		opref.wifisettingstext().sendKeys("Sudhi");;
		opref.buttons().get(1).click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
	}

}
