package com.appium.utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.ServerSocket;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Base {
	public static AppiumDriverLocalService service;
	public AppiumDriverLocalService startServer()
	{
		//
	boolean flag=	checkIfServerIsRunnning(4723);
	if(!flag)
	{
		
		service=AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
		return service;
		
	}
	
public static boolean checkIfServerIsRunnning(int port) {
		
		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			
			serverSocket.close();
		} catch (IOException e) {
			//If control comes here, then it means that the port is in use
			isServerRunning = true;
		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

	public static void startEmulator() throws IOException, InterruptedException
	{
	
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\com\\appium\\utilities\\startEmulator.bat");
		Thread.sleep(15000);
	}
	
	public static  AndroidDriver<AndroidElement> capabilities(String appName, String appActivity,String deviceName) throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\appium\\utilities\\prop.properties");
		Properties prop = new Properties();
		prop.load(fis);
		AndroidDriver<AndroidElement> driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,(String) prop.get(deviceName) );
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		capabilities.setCapability(MobileCapabilityType.VERSION, "9.0");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability("appPackage", (String) prop.get(appName));
		capabilities.setCapability("appActivity", (String) prop.get(appActivity));
		//capabilities.setCapability("appWaitDuration", 40000);
		capabilities.setCapability("appWaitPackage", (String) prop.get(appName));
		capabilities.setCapability("appWaitActivity", (String) prop.get(appActivity));
	    driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	   return driver;
	   
	}
}
