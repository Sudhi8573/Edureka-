package com.apidemo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.apidemo.object.API_Demo_Odragdrop;
import com.appium.utilities.ScrollUtil;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class APIDemo_DragDropPage {
	
	AndroidDriver<AndroidElement> driver;
	API_Demo_Odragdrop odragdrop;
	
	public APIDemo_DragDropPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		odragdrop = new API_Demo_Odragdrop(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void dragdrop() {
		
		ScrollUtil.scrollToTextClick("Views", driver);
		ScrollUtil.scrollToTextClick("Drag and Drop", driver);
		WebElement initialele = odragdrop.initialelem();
		WebElement finalele = odragdrop.finalelem();
		
		TouchAction t = new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(initialele))).moveTo(element(finalele)).release().perform();
		
	}

}
