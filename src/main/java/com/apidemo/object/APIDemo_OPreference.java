package com.apidemo.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class APIDemo_OPreference {
	
	public APIDemo_OPreference(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="android:id/checkbox")
	private WebElement checkbox;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	private WebElement dependencies;
	
	@AndroidFindBy(className="android.widget.CheckBox")
	private WebElement radiobutton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"WiFi settings\"]")
	private WebElement wifisettings;

	@AndroidFindBy(className="android.widget.EditText")
	private WebElement wifisettingstext;
	
	@AndroidFindBy(className="android.widget.Button")
	private List<WebElement> buttons;
	
	public WebElement checkbox() {
		return checkbox;
	}
	
	public WebElement dependencies() {
		return dependencies;
	}

	public WebElement radiobutton() {
		return radiobutton;
	}
	
	public WebElement wifisettingstext() {
		return wifisettingstext;
	}
	
	public WebElement wifisettings() {
		return wifisettings;
	}
	
	public List<WebElement> buttons() {
		return buttons;
	}
	
}
