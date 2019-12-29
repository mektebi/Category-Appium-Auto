package com.category.test.tests;

import com.category.test.helper.AppiumBaseClass;
import com.category.test.helper.AppiumController;
import com.category.test.pages.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTestClass extends AppiumBaseClass {

	protected LoginPage loginPage;
	protected EvBakimPage evBakimPage;
	protected KisiselBakimPage kisiselBakimPage;
	protected CategoryPage categoryPage;
	protected ShoppingCartPage shoppingCartPage;

	@BeforeSuite
	public void setUp() throws Exception {
		AppiumController.instance.start();
		switch (AppiumController.executionOS) {
		case ANDROID:

			loginPage = new LoginPageAndroid(driver());
			evBakimPage = new EvBakimPageAndroid(driver());
			kisiselBakimPage = new kisiselbakimPageAndroid(driver());
			categoryPage = new CategoryPageAndroid(driver());
			shoppingCartPage = new ShoppingCartPageAndroid(driver());
			break;

		}
	}

	@AfterSuite
	public void tearDown() {
		AppiumController.instance.stop();
	}
}
