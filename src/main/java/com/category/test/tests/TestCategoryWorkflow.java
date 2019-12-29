package com.category.test.tests;

import com.category.test.helper.AppiumController;
import com.category.test.pages.EvBakimPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCategoryWorkflow extends BaseTestClass {

	private String email = "hello@getir.com";
	private String password = "hello";


	@Test
	public void ScenarioTestCategoryWorkflow() {

		// Log in using the credentials
		loginPage.login(email, password);

		categoryPage.gotoKisisel();

		kisiselBakimPage.selectKrem();

		kisiselBakimPage.navigate_up();

		categoryPage.gotoEvBakim();

		evBakimPage.selectDeterjan();

		evBakimPage.gotoShoppingCart();

		evBakimPage.deleteDeterjan();

		evBakimPage.deleteKrem();


	}
}
