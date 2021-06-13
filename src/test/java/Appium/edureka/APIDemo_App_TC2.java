package Appium.edureka;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.apidemo.pages.APIDemo_DragDropPage;
import com.appium.utilities.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class APIDemo_App_TC2 extends Base{
	
	AndroidDriver<AndroidElement> driver;
	APIDemo_DragDropPage adragdrop;
	
	@BeforeSuite
	public void server() {
		service=startServer();
	}
	
	@Parameters({"deviceName"})
	@BeforeTest
	public void beforemethods(String deviceName) throws IOException, InterruptedException {
		driver = capabilities("APIDemoApp","APIDemoActivity",deviceName);
		adragdrop = new APIDemo_DragDropPage(driver);
	}
	
	@Test
	public void dragDrop() {
		adragdrop.dragdrop();
		
	}
	
	
	@AfterSuite
	public void aftertest() throws InterruptedException {
	service.stop();
	}

}
