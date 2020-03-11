package TestPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.DriverBase;
import general.KeywordFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage extends DriverBase {

	protected Logger log = Logger.getLogger(LoginPage.class.getName());
	protected KeywordFunctions keys;
	public Properties obj;
	public FileInputStream objfile;
	public String username, password, search_content;
	WebDriverWait wait;
	
	//page factory design
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.amazon.mShop.android.shopping:id/sign_in_button']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement already_cust_sign;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.amazon.mShop.android.shopping:id/skip_sign_in_button']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement skip_signin;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.amazon.mShop.android.shopping:id/action_bar_burger_icon']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement hamb_menu;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.amazon.mShop.android.shopping:id/gno_greeting_text_view']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement signtxt;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='ap_login_form']/android.view.View[1]")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement mob_email;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement mob_email_box;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='ap_login_form']/android.view.View[2]")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cont;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='ap_password']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement pwd;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='signInSubmit']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement login;
	
	//page factory implementation
	public LoginPage(AppiumDriver driver) {
		
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	//to use keywordfunction methods
	keys = new KeywordFunctions(driver);
	}
	
	
	public void login() throws InterruptedException, IOException
	{
		

		wait=new WebDriverWait(driver,10);
		
		obj = new Properties(); 
  		log.info(getClass());
  		System.out.println(System.getProperty("user.dir"));
		objfile = new FileInputStream(System.getProperty("user.dir")+"/util/testdata.properties");
		obj.load(objfile);

		username = obj.getProperty("username");
		password = obj.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		log.info("Retreiving Username and Password from property file");
	
		keys.clickElement(wait.until(ExpectedConditions.visibilityOf(already_cust_sign)));
		log.info("Clicked already customer signin successfully");
		
		keys.clickElement(wait.until(ExpectedConditions.visibilityOf(mob_email_box)));
		log.info("Clicked already mobile or email field successfully");

		keys.sendString(wait.until(ExpectedConditions.visibilityOf(mob_email_box)), username);
		log.info("Typed email id successfully");

		keys.clickElement(wait.until(ExpectedConditions.visibilityOf(cont)));
		log.info("Clicked continue successfully");

		keys.sendString(wait.until(ExpectedConditions.visibilityOf(pwd)), password);
		log.info("Typed Password successfully");

		keys.clickElement(wait.until(ExpectedConditions.visibilityOf(login)));
		log.info("Clicked login successfully");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Waiting to login");

	
	}

}
