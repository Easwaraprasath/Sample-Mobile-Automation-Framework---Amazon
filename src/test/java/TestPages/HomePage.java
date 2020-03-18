package TestPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.DriverBase;
import general.KeywordFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import org.testng.Assert;

public class HomePage extends DriverBase {

	protected Logger log = Logger.getLogger(HomePage.class.getName());// + ":" + nameofCurrMethod);
	protected KeywordFunctions keys;
	public Properties obj;
	public FileInputStream objfile;
	public String search_content, product_name;
	WebDriverWait wait;

	// page factory design
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.amazon.mShop.android.shopping:id/skip_sign_in_button']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement skip_signin;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Home']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement title;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.amazon.mShop.android.shopping:id/action_bar_burger_icon']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement hamb_menu;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.amazon.mShop.android.shopping:id/rs_search_src_text']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement search_box;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sanyo 165 cm (65 inches) Kaizen Series 4K Ultra HD Smart Certified Android IPS LED TV XT-65A082U (Black) (2019 Model)']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement s_prod_name;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='₹54,999 ₹95,990']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement s_prod_price;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@text='Sanyo 165 cm (65 inches) Kaizen Series 4K Ultra HD Smart Certified Android IPS LED TV XT-65A082U (Black) (2019 Model)']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement prod_name;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='rupees 54,999']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement prod_price;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Add to Cart']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement add_cart;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Buy Now']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement buy_now;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Cart']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_img;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ListView/android.view.View[@index='0']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_itm_price;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@text='close']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement close;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='sc-proceed-to-checkout-params-form']/android.view.View[@index='3']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_subtotal;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@text='Sanyo 165 cm (65 inches) Kaizen Series 4K Ultra HD Smart Certifi...']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_itm_name;

	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Proceed to Buy']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_proceed_tobuy;

	// page factory initialization
	/*
	 * public HomePage() {
	 * PageFactory.initElements(new AppiumFieldDecorator(driver), this); }
	 */
}
package TestPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.temporal.ChronoUnit;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.DriverBase;
import general.KeywordFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import org.testng.Assert;

public class HomePage extends DriverBase{
	
	protected Logger log = Logger.getLogger(HomePage.class.getName());// + ":" + nameofCurrMethod);
	protected KeywordFunctions keys;
	public Properties obj;
	public FileInputStream objfile;
	public String search_content, product_name;
	WebDriverWait wait;
	
	//page factory design
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.amazon.mShop.android.shopping:id/skip_sign_in_button']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement skip_signin;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.amazon.mShop.android.shopping:id/chrome_action_bar_home_logo']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement title;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.amazon.mShop.android.shopping:id/action_bar_burger_icon']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement hamb_menu;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.amazon.mShop.android.shopping:id/rs_search_src_text']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement search_box;
	
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sanyo 165 cm (65 inches) Kaizen Series 4K Ultra HD Smart Certified Android IPS LED TV XT-65A082U (Black) (2019 Model)']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement s_prod_name;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='₹54,999 ₹95,990']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement s_prod_price;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@text='Sanyo 165 cm (65 inches) Kaizen Series 4K Ultra HD Smart Certified Android IPS LED TV XT-65A082U (Black) (2019 Model)']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement prod_name;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='rupees 54,999']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement prod_price;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Add to Cart']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement add_cart;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[@text='Buy Now']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement buy_now;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Cart']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_img;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.widget.ListView/android.view.View[@index='0']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_itm_price; 
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@text='close']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement close;
	
	@CacheLookup
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='sc-proceed-to-checkout-params-form']/android.view.View[@index='3']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_subtotal; 
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.view.View[@text='Sanyo 165 cm (65 inches) Kaizen Series 4K Ultra HD Smart Certifi...']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_itm_name;
	
	@CacheLookup
	@AndroidFindBy(xpath="//android.widget.Button[@text='Proceed to Buy']")
	@WithTimeout(time = 25, chronoUnit = ChronoUnit.SECONDS)
	public WebElement cart_proceed_tobuy;
	
	//page factory implementation
	public HomePage(AppiumDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//to use keywordfunction methods
		keys = new KeywordFunctions(driver);
		}
		
		//performing cart operation after login
		public void cartoperation() throws InterruptedException, IOException
		{
			wait=new WebDriverWait(driver,10);
			obj = new Properties(); 
	  		log.info(getClass());
	  		System.out.println(System.getProperty("user.dir"));
			objfile = new FileInputStream(System.getProperty("user.dir")+"/util/testdata.properties");
			obj.load(objfile);
			/*
			 * To read data from excel sheet
			ExcelRead=new FileInputStream("TestData/testdata.xlsx");
			wbk=new XSSFWorkbook(ExcelRead);
			String search_item = wbk.getSheetAt(0).getRow(3).getCell(1).toString();
	 		*/
			log.info("Login successfull");
			keys.landscape();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("Landscape rotation successfull");
			keys.portrait();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			log.info("Portrait rotation successfull");
			
			search_content = obj.getProperty("search_content");
			log.info("Reading search content from external property file");
			System.out.println("search content:"+search_content);
			//Must be commented
			//keys.clickElement(wait.until(ExpectedConditions.visibilityOf(skip_signin)));
			//log.info("Signin skipped");
			
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(search_box)));
			log.info("Clicked searchbox successfuly");

			keys.sendString(search_box, search_content);
			log.info("Typed search content successfuly");

			keys.enter_key();
			log.info("Clicked enter successfuly");

			product_name = obj.getProperty("product_name");
			System.out.println(product_name);
			log.info("Reading product name from external property file");
			keys.scrollToText(product_name);
			log.info("Scrolled till product name successfuly");
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(s_prod_name)));
			log.info("Clicked product name successfuly");
			String pr_prce = keys.getElementText(prod_price, "text");
			log.info("retrieving product price");

			System.out.println(pr_prce); //rupees 54,999
			keys.VscrolltoElement(.98, .96, .28);
			log.info("Scrolled till Add to Cart successfuly");

			//keys.tryVscrolltoElement("//android.widget.Button[@text='Add to Cart']",.98, .96, .50);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.visibilityOf(add_cart));
			
			keys.clickElement(add_cart);
			log.info("Clicked Add to Cart successfuly");

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(cart_img)));
			log.info("Clicked view cart successfuly");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			String crt_itm_prce = keys.getElementText(cart_itm_price, "text");
			log.info("Retreiving cart item product price");

			System.out.println(crt_itm_prce); //   54,999.00
			//54,999.00
			//String cip="54,999.00";
			log.info("Performing substring operation with both product and cart item price");

			String spp=pr_prce.substring(7,pr_prce.length());
			System.out.println(spp);
			//String scip=crt_itm_prce.substring(2,8);
			//System.out.println(scip);
			log.info("Comparing both prices with assertion");

			Assert.assertTrue(crt_itm_prce.contains(spp));
			keys.clickElement(wait.until(ExpectedConditions.visibilityOf(cart_proceed_tobuy)));
			log.info("Clicked Proceed to Buy successfuly");

		}


}
