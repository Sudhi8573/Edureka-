package Appium.edureka;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import com.appium.utilities.Base;
import com.curefit.pages.CureFit_HomePage;
import com.curefit.pages.CureFite_CultPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CureFit_App_TC extends Base {
	CureFit_HomePage homePage;
	CureFite_CultPage cult;
	
	
	AndroidDriver<AndroidElement> driver;
	
	@BeforeSuite
	public void server() {
		service=startServer();
	}
	
	@BeforeTest
	public void beforemethods() throws IOException, InterruptedException {
		driver = capabilities("CureFitApp","CureFitActivity","RealDevice");
		homePage = new CureFit_HomePage(driver);
		cult = new CureFite_CultPage(driver);
	}
	
	//CureFit App TC_4 "Send the App to Background and bring it back"
	@Test
	public void appBackground() throws IOException, InterruptedException {
		int loginstatus = homePage.login();
		if(loginstatus==1) {
			System.out.println("Login is Successful");
		AssertJUnit.assertEquals("Login is Successful", loginstatus, 1);
		}
		else {
			AssertJUnit.assertFalse("Login Not Successful", false);
		}
		
		driver.navigate().back();
		
		int appstatus = homePage.appstatus("CureFitApp");
		if(appstatus == 1) {
			System.out.println("Appstatus ran in background for 10 Seconds");
		AssertJUnit.assertEquals("Appstatus ran in background for 10 Seconds", appstatus, 1);
		}
		else {
			AssertJUnit.assertFalse("App did not ran in the background", false);
		}	
		
	}
	
	//CureFit App TC_6 "Select the Workout Pack"
	@Test
	public void buyWorkout() throws IOException, InterruptedException {
		
		int loginstatus = homePage.login();
		if(loginstatus==1) {
			System.out.println("Login is Successful");
		AssertJUnit.assertEquals("Login is Successful", loginstatus, 1);
		}
		else {
			AssertJUnit.assertFalse("Login Not Successful", false);
		}
		
		int purchasestatus = cult.cultpage();
		if(purchasestatus==1) {
			System.out.println("Purchase Amount Validated Successfully");
		AssertJUnit.assertEquals("Purchase Amount Validated Successfully", purchasestatus, 1);
		}
		else {
			AssertJUnit.assertFalse("Purchase Amount Validation Failed", false);
		}
	}
	
	
	@AfterSuite
	public void aftertest() throws InterruptedException {
	service.stop();
	}

}
