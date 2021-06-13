package com.curefit.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CureFit_OHome {
	
	public CureFit_OHome(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sign in with email']")
	private List<WebElement> signinwithemaillist;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Sign in with email']")
	private WebElement signinwithemail;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Email']")
	private WebElement emailID;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Password']")
	private WebElement password;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='SIGN IN']")
	private WebElement signinbutton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='ALLOW']")
	private WebElement allowbutton;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"ME\"]")
	private WebElement loginImage;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Account']")
	private WebElement account;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Contact Details']")
	private WebElement contactDetails;
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"ACCOUNT_SETTING_primaryEmail\"]/android.widget.TextView[1]")
	private WebElement primaryEmailDetails;
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private WebElement navigate;
	
	@AndroidFindBy(className="android.widget.Button")
	private WebElement backButton;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='CF_IMAGE_LOADED/https://cdn-images.cure.fit/www-curefit-com/image/upload/w_434,q_auto:eco,f_auto,c_fit//image/vm/1387d981-a922-403d-9c7a-ecf6a41955c9.png']")
	//@AndroidFindBy(xpath="//android.widget.TextView[@text='COVID-19 Home Care']")
	//android.widget.TextView[@text='COVID-19 Home Care']
	private WebElement meditationImage;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='CF_IMAGE_LOADED/https://cdn-images.cure.fit/www-curefit-com/image/upload/w_914,q_auto:eco,f_auto,c_fit/image/diy/928c7a68-3ca6-4477-b696-745a43c2c4de']")
	private WebElement happinessImage;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='HOME']")
	private WebElement homeButton;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc='CF_IMAGE_LOADED/https://cdn-images.cure.fit/www-curefit-com/image/upload/w_350,q_auto:eco,f_auto,c_fit//image/diy/c443644b-0dcf-4586-8a13-8b89273b19be']")
	private WebElement playVideo;
	
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"PRODUCT_LIST_WIDGET_0\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement downloadButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView(contains[@text,':']")
	private WebElement timer;
	
	public List<WebElement> signinwithemaillist() {
		return signinwithemaillist;
	}
	
	public WebElement signinwithemail() {
		return signinwithemail;
	}
	
	public WebElement emailId() {
		return emailID;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement sigin() {
		return signinbutton;
	}
	
	public WebElement allow() {
		return allowbutton;
	}
	
	public WebElement loginImage() {
		return loginImage;
	}
	
	public WebElement account() {
		return account;
	}
	
	public WebElement contactDetails() {
		return contactDetails;
	}
	
	public WebElement primaryEmailDetails() {
		return primaryEmailDetails;
	}
	
	public WebElement navigate() {
		return navigate;
	}
	
	public WebElement backButton() {
		return backButton;
	}
	
	public WebElement meditationImage() {
		return meditationImage;
	}
	
	public WebElement happinessImage() {
		return happinessImage;
	}

	public WebElement homeButton() {
		return homeButton;
	}
	
	public WebElement downloadButton() {
		return downloadButton;
	}
	
	public WebElement playVideo() {
		return playVideo;
	}
	
	public WebElement timer() {
		return timer;
	}
	
}
