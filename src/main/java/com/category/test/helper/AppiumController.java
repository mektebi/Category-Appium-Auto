package com.category.test.helper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AppiumController {

	public static OS executionOS = OS.ANDROID;

	public enum OS {
		ANDROID
	}

	public static AppiumController instance = new AppiumController();
	public AppiumDriver<?> driver;

	public void start() throws MalformedURLException {
		if (driver != null) {
			return;
		}
		switch (executionOS) {
		case ANDROID:
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("deviceName", "c1d96868");
			dc.setCapability( "appPackage", "com.getir.getirtestingcasestudy");
			dc.setCapability( "appActivity", "com.getir.getirtestingcasestudy.ui.login.LoginActivity");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
			break;
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void stop() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
