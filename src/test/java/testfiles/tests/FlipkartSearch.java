package testfiles.tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseFiles.PageObjectForLogin;
import baseFiles.PageObjectForSearch;
import testfiles.testcomponents.BaseTest;

public class FlipkartSearch extends BaseTest {
	@Test
	public void login() throws InterruptedException, IOException {
		launchApplication();
		PageObjectForLogin obj = new PageObjectForLogin(driver);
		obj.goTo();// URL
		obj.getFlipkartLogin("9966019169", "Chinna@5237");// LOGIN
		Thread.sleep(1000);
		PageObjectForSearch obj1 = new PageObjectForSearch(driver);
		obj1.getPlaceHolderText();
		obj1.getSearchIcon();
		obj1.getFcartEnterFromKeyboard();
		Thread.sleep(3000);
		obj1.getFlipkartRefreshpage();

		obj1.getFlipkartSearch("Nokia basic mobiles" + Keys.ENTER);
		obj1.getFcartSearchvsresult("Nokia basic mobiles");
		obj1.getFlipkartRefreshpage();
		obj1.getVerifiWithMouse(driver);
		obj1.getFcartInvalidDetails("Sorry, no results found!");

	}

}