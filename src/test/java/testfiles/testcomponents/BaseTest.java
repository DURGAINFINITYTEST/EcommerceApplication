package testfiles.testcomponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public Properties pro;
	public FileInputStream fis;
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		pro = new Properties();
		fis = new FileInputStream("/FlipkartApplication/src/main/java/baseFiles/resources/Globaldata.properties");
		pro.load(fis);
		String s = pro.getProperty("broswer");

		if (s.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\katak\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (s.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\katak\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public void launchApplication() throws IOException {
		driver = initializeDriver();

	}
}
