package com.category.test.pages;
import com.category.test.helper.*;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.category.test.helper.AppiumHelper;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageAndroid extends AppiumHelper implements LoginPage {
	WebDriverWait wait = new WebDriverWait(AppiumController.instance.driver,30);
	@CacheLookup
	@AndroidFindBy(id = "com.getir.getirtestingcasestudy:id/email")
	public AndroidElement emailInput;

	@CacheLookup
	@AndroidFindBy(id = "com.getir.getirtestingcasestudy:id/password")
	public AndroidElement passwordInput;

	@CacheLookup
	@AndroidFindBy(id = "com.getir.getirtestingcasestudy:id/email_sign_in_button")
	public AndroidElement signinBtn;

	public void typeEmail(String email) {
		emailInput.sendKeys(email);
	}
	public void typePassword(String password) {
		passwordInput.sendKeys(password);
	}
	public void clickSignin() {
		signinBtn.click();
	}

	public LoginPageAndroid(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void login (String email, String password) {
		typeEmail(email);
		typePassword(password);
		clickSignin();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")));

	}

}
