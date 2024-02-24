package testfiles.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import baseFiles.PageObjectForLogin;
import testfiles.testcomponents.BaseTest;

public class FlipkartLogin extends BaseTest {
	@Test
	public void login() throws IOException {
		launchApplication();
		PageObjectForLogin obj = new PageObjectForLogin(driver);
		obj.goTo();
		obj.getFlipkartLogin("9966019169", "Chinna@5237");

	}

}