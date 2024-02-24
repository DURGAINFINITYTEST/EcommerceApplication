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

public class PageObjectForSearch {

	WebDriver driver;

	public PageObjectForSearch(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='_3704LK']")
	WebElement SerchBar;

	@FindBy(xpath = "//input[@class='_3704LK']")
	WebElement FlipcartSearch;

	@FindBy(xpath = "//span[contains(text(),'Nokia basic mobiles')]")
	WebElement FcartSearchvsresult;

	@FindBy(className = "_3704LK")
	WebElement SerchIcon;
	@FindBy(xpath = "//input[@class='_3704LK']")
	WebElement FcartEnterFromKeyboard;
	// refresh
	@FindBy(xpath = "//img[@class='_2xm1JU']")
	WebElement flipkartPageRefresh;

	@FindBy(xpath = "//div[contains(text(),'Sorry, no results found!')]")
	WebElement flipkartInvalidSearch;

	public void getPlaceHolderText() {

		System.out.println(SerchBar.getAttribute("placeholder"));

	}

	public void getSearchIcon() {

		if (SerchIcon.isDisplayed()) {
			System.out.println("search icon is displayed");

		} else {

			System.out.println("search icon is not  displayed");
		}

	}

	public void getFcartSearchvsresult(String d) {
		FcartSearchvsresult.equals(d);
		{

			System.out.println("generating the correct result for correct keywords");

		}

	}

	public void getFcartEnterFromKeyboard() throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		String searchText = sc.next();
		FcartEnterFromKeyboard.sendKeys(searchText);
		Thread.sleep(1000);
		System.out.println("iam enter the keyword using keyboard " + searchText);

	}

	public void getFlipkartSearch(String c) throws InterruptedException {

		FlipcartSearch.sendKeys(c);
		Thread.sleep(2000);

	}

	public void getFlipkartRefreshpage() {
		flipkartPageRefresh.click();
	}

	public void getVerifiWithMouse(WebDriver driver) throws InterruptedException {
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("FilaFlips");
		Actions ac = new Actions(driver);

		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		search.clear();
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		search.clear();

	}

	public void getFcartInvalidDetails(String s) {

		FlipcartSearch.sendKeys("$$$" + Keys.ENTER);
		flipkartInvalidSearch.equals(s);
		{
			System.out.println("invalid details");

		}

	}

}
