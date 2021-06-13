package com.apidemo.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class API_Demo_Odragdrop {
	
	public API_Demo_Odragdrop(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.view.View[@index ='1']")
	private WebElement initialelem;
	
	@AndroidFindBy(xpath="//android.view.View[@index ='2']")
	private WebElement finalelem;
	
	public WebElement initialelem() {
		return initialelem;
	}
	
	public WebElement finalelem() {
		return finalelem;
	}
	

}
