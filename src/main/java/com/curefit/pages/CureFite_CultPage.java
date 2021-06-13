package com.curefit.pages;

import java.util.concurrent.TimeUnit;

import com.curefit.objects.CureFit_OCultPage;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class CureFite_CultPage {
	
	AndroidDriver<AndroidElement> driver;
	CureFit_OCultPage cult;
	int purchaseStatus =0;
	
	public CureFite_CultPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		cult = new CureFit_OCultPage(driver);
	}
	
	public int cultpage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String amount;
		
		cult.cultButton().click();
		cult.bookNowButton().click();
		cult.datePicker().click();
		cult.yoga().click();

		TouchAction t = new TouchAction(driver);
		t.tap(PointOption.point(1142,2100)).perform();

		cult.confirmBook().click();
		amount =driver.findElementByXPath("//android.widget.TextView[starts-with(@text,'₹')][1]").getText();
		System.out.println(amount);
		String s = new String(amount);
		amount = s.substring(1,4);
		System.out.println(amount);
		String amount2 = driver.findElementByXPath("//android.widget.TextView[contains(@text, 'BOOK')]").getText();
		System.out.println(amount2);
		String s1 = new String(amount2);
		amount2 = s1.substring(10);
		System.out.println(amount2);
		if(amount.equals(amount2))
		{
		System.out.println("EQUALS");
		purchaseStatus =1;
		}
		
		cult.checkoutBack().click();
		cult.navigateUP().click();
		cult.dateBack().click();
		return purchaseStatus;
		
	}
	

}
