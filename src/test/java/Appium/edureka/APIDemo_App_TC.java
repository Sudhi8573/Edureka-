package Appium.edureka;

import java.io.IOException;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.apidemo.pages.APIDemo_DragDropPage;
import com.apidemo.pages.APIDemo_LoginPage;
import com.apidemo.pages.APIDemo_PreferencePage;
import com.appium.utilities.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class APIDemo_App_TC extends Base{
	
	AndroidDriver<AndroidElement> driver;
	APIDemo_LoginPage gLogin;
	APIDemo_PreferencePage apref;
	APIDemo_DragDropPage adragdrop;
	
	@BeforeSuite
	public void server() {
		service=startServer();
	}
	
	@Parameters({"deviceName"})
	@BeforeTest
	public void beforemethods(String deviceName) throws IOException, InterruptedException {
		driver = capabilities("APIDemoApp","APIDemoActivity",deviceName);
		gLogin = new APIDemo_LoginPage(driver);
		apref = new APIDemo_PreferencePage(driver);
		adragdrop = new APIDemo_DragDropPage(driver);
	}
	
	//CureFit App TC_4 "Send the App to Background and bring it back"
	@Test(priority = 1)
	public void general_login() {
		gLogin.apilogin();
	}
	
	@Test(priority = 2)
	public void preference_page() throws InterruptedException {
		apref.preferncePage();
		
	}	
	
	@AfterSuite
	public void aftertest() throws InterruptedException {
	service.stop();
	}

}
