package com.curefit.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CureFit_OCultPage {
	
	public CureFit_OCultPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc='CULT']")
	private WebElement cultbutton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='BOOK NOW']")
	private WebElement bookNowButton; 
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc='AVAILABLE_DATE_3']")
	private WebElement datePicker;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Yoga']")
	private WebElement yoga;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup//android.widget.TextView")
	private List<WebElement>  timePicker;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='CONFIRM & BOOK']")
	private WebElement confirmBook;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup//android.widget.TextView")
	private List<WebElement> totalPayabale;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc='CART_CHECKOUT_BACK']")
	private WebElement checkoutBack;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private WebElement navigateUP;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc='SELECT_CARE_DATE_V1_BACK']")
	private WebElement dateBack;
	
	
	
	//android.widget.TextView[@text='₹199.00']
	public WebElement cultButton() {
		return cultbutton;
	}


	public WebElement bookNowButton() {
		return bookNowButton;
	}
	
	public WebElement datePicker() {
		return datePicker;
	}
	
	public WebElement yoga() {
		return yoga;
	}
	
	public List<WebElement> timePicker() {
		return timePicker;
	}
	
	public WebElement confirmBook() {
		return confirmBook;
	}
	
	public  List<WebElement> totalPayable() {
		return totalPayabale;
	}
	
	public WebElement checkoutBack() {
		return checkoutBack;
	}
	
	public WebElement navigateUP() {
		return navigateUP;
	}
	
	public WebElement dateBack() {
		return dateBack;
	}

}
