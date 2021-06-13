package com.curefit.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.appium.utilities.ScrollUtil;
import com.curefit.objects.CureFit_OHome;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CureFit_HomePage {

	AndroidDriver<AndroidElement> driver;
	CureFit_OHome objhome;
	Properties prop;
	int loginstatus = 0;
	public CureFit_HomePage(AndroidDriver<AndroidElement> driver) throws IOException {
		
		this.driver = driver;
		objhome = new CureFit_OHome(driver);
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\appium\\utilities\\prop.properties");
		prop = new Properties();
		prop.load(fis);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	public int login() throws InterruptedException, IOException {		 
		
		int sigin = objhome.signinwithemaillist().size();
		System.out.println(sigin);
		if(sigin >=1) {
	   //To Login to App
		objhome.signinwithemail().click();
		objhome.emailId().sendKeys("sudhivillas3095@gmail.com");
		objhome.password().sendKeys("Ducati@123");
		objhome.sigin().click();
		objhome.allow().click();
		
		//To Verify Login

		objhome.loginImage().click();
		objhome.account().click();
		objhome.contactDetails().click();
		String data = objhome.primaryEmailDetails().getText();
			if(data.contentEquals("sudhitestmobile@gmail.com")) {
				loginstatus = 1;
			}
			
		objhome.navigate().click();
		objhome.backButton().click();
		
		return loginstatus;
		
		}
		
		return loginstatus;
		
	}
	
	
	public int appstatus(String appName) {
		
		int appstatus =0;
		String status;
		driver.runAppInBackground(Duration.ofSeconds(10));
		status = driver.queryAppState((String) prop.get(appName)).toString();
		
		if (status.equals("RUNNING_IN_FOREGROUND")) {
			appstatus =1;
		}
		
		return appstatus;
	}
	
	public void playVideo(AndroidDriver<AndroidElement> driver2) throws IOException, InterruptedException {
		
		objhome.homeButton().click();
		TouchAction t = new TouchAction(driver);
		
		ScrollUtil.scrollUp(3,driver);
		
		objhome.meditationImage().click();
		
		ScrollUtil.scrollUp(1,driver);

		objhome.happinessImage().click();

		ScrollUtil.scrollUp(1,driver);
		
		objhome.downloadButton().click();

		/*
		boolean wifi = driver.getConnection().isWiFiEnabled();
		if (wifi == true) {
			System.out.println("Wifi is enabled");
			driver.toggleWifi();
		}
		
		boolean data = driver.getConnection().isDataEnabled();
		if (data == true) {
			System.out.println("Data is enabled");
			driver.toggleData();;
		}*/
		Thread.sleep(3000);
		objhome.playVideo().click();
		Thread.sleep(3000);
		List<AndroidElement> list = driver.findElementsByXPath("//android.view.ViewGroup[@content-desc='VIDEO_SCREEN']");
		System.out.println(list);
}
}
