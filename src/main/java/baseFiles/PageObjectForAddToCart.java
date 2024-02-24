package baseFiles;

import java.awt.Desktop.Action;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageObjectForAddToCart {

	WebDriver driver;

	public PageObjectForAddToCart(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	WebElement UserName;

	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement UserPswd;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement UserLogin;

	@FindBy(xpath = "//a[@title='WOW SKIN SCIENCE Onion Shampoo for Hair Growth and Hair Fall Control']")
	WebElement wowProduct;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement addToCart;

	public void goTo() {
		driver.get("https://www.flipkart.com/");

	}

	public void getFlipkartLoginForAddToCart(String a, String b) {
		UserName.sendKeys(a);
		UserPswd.sendKeys(b);
		UserLogin.click();

	}

}
