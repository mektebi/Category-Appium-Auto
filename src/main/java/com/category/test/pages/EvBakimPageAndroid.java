package com.category.test.pages;

import com.category.test.helper.AppiumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class EvBakimPageAndroid extends AppiumHelper implements EvBakimPage {

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]")
	public MobileElement deterjan;

	@FindBy(id = "Navigate up")
	public MobileElement navigateUp;

	@FindBy(xpath = "//android.widget.TextView[@content-desc=\"Shopping Cart\"]\n")
	public MobileElement shoppingCartBtn;


	public EvBakimPageAndroid(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@Override
	public void selectDeterjan() {

		clickElement(deterjan);

	}

	@Override
	public void navigate_up() {

		clickElement(navigateUp);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView")));

	}

	@Override
	public void gotoShoppingCart() {

		clickElement(shoppingCartBtn);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.getir.getirtestingcasestudy:id/total_price")));

	}

}
