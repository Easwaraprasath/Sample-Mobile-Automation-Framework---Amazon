package TestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import TestBase.DriverBase;
import TestPages.HomePage;
import TestPages.LoginPage;
import io.appium.java_client.AppiumDriver;

public class Amazon_TestCases extends DriverBase {
@Test
public void tc001_LoginAndCartOperation() throws InterruptedException, IOException
{	//Interacting with login page
	LoginPage lp=new LoginPage((AppiumDriver) driver);
	lp.login();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Interacting with home page
	HomePage hp=new HomePage((AppiumDriver) driver);
	hp.cartoperation();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

}
}
