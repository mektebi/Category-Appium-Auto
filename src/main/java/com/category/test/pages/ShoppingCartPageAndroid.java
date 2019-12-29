package com.category.test.pages;

import com.category.test.helper.AppiumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ShoppingCartPageAndroid extends AppiumHelper implements ShoppingCartPage {

	@FindBy(id = "com.getir.getirtestingcasestudy:id/total_price")
	public MobileElement totalPrice;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
	public MobileElement DeterjanDeleteBtn;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.ImageView")
	public MobileElement KremDeleteBtn;

	public ShoppingCartPageAndroid(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@Override
	public void deleteKrem() {

		clickElement(KremDeleteBtn);

	}

	@Override
	public void deleteDeterjan() {

		clickElement(DeterjanDeleteBtn);

	}

	@Override
	public void checkTotalPrice(String total) {

//		Assert.assertEquals(AppiumController.instance.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView").getText(), total);
		//Assert.assertEquals(totalPrice.getText(), total);

	}

}
