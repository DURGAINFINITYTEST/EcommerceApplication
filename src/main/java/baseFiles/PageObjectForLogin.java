package baseFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectForLogin {

	WebDriver driver;

	public PageObjectForLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	WebElement UserName;

	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement UserPswd;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement UserLogin;

	public void goTo() {
		driver.get("https://www.flipkart.com/");
	}

	public void getFlipkartLogin(String a, String b) {
		UserName.sendKeys(a);
		UserPswd.sendKeys(b);
		UserLogin.click();

	}

}
