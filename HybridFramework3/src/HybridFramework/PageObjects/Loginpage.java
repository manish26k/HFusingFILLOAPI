package HybridFramework.PageObjects;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HybridFramework.base.HybridFramework_ObjectBase;
import HybridFramework.base.HybridFramework_TestBase;
import HybridFramework.base.HybridFramework_webdriverwait;
import HybridFramework.helper.HybridFramework_Wait;


public class Loginpage extends HybridFramework_ObjectBase
{
	String email;
	
	public Loginpage(WebDriver driver) throws Exception 
	{
		this.driver=driver;	
		doconfig();
		WebElement SignInelement= getWebElement("SignIn");
		wait=new HybridFramework_Wait(driver);
		wait.waitForElement(driver,SignInelement, new HybridFramework_webdriverwait().getExplicitWait());
	}
	
	public void doconfig(){
		rbelement=ResourceBundle.getBundle("Element");
		rb=ResourceBundle.getBundle("Config");
		email=rb.getString("Emailadd");
     }
	
	public void clickonSignIn() throws Exception
	{
		log.info("clickonSignIn");
		
		/*doClick("SignIn");*/
		
	    getWebElement("SignIn").click();
		
	}
	
	public void clickonSign(String data) throws Exception
	{
		 getWebElement("SignIn").click();
	}
	
	
	
	
	
	public void enterEmailAddress() throws Exception
	{
		//log.info("enterEmailAddress....."+Emailvalue);
		
		//getWebElement("Password").sendKeys(rb.getString(Emailvalue));
				
		getWebElement("Email").sendKeys(email);
		
		
		
		
		
	}
	
	
	public void enterEmailAddress01(String userName) throws Exception
	{
		log.info("enterEmailAddress01....."+userName);
		getWebElement("Email").sendKeys(userName);
		
	}
	
	
	public void enterPassword(String Passvalue) throws Exception
	{
		log.info("enterPassword....."+Passvalue);
		
		getWebElement("Password").sendKeys(rb.getString(Passvalue));
		
	}
	
	
	public void enterPassword01(String password) throws Exception
	{
		log.info("enterPassword01....."+password);
		getWebElement("Email").sendKeys(password);
		
	}
	
	public MyAccountpage clickonSignInbutton() throws Exception
	{
		log.info("clickonSignInbutton");
		
		getWebElement("SignInbutton").click();
		
		
		log.info("returning MyAccountpage");
		return new MyAccountpage(this.driver);
	}
	
	
	public void clickonSignOut() throws Exception {
		
		log.info("clickonSignOut");
		
		getWebElement("SignOut").click();
		
	}
	
	
	
	
	public void enterRegisterEmail(String Emailregister) throws Exception{
		
		log.info("enterRegisterEmail");
		getWebElement("NewEmailAddress").sendKeys(rb.getString(Emailregister));
		
	}
	
	public Registerpage clickOnCreateAccount() throws Exception{
		
		log.info("clickOnCreateAccount");
		getWebElement("CreateAccount").click();
		
		
		log.info("returning Registerpage");
		return new Registerpage(driver);
		
	}
	
	
	public void loginToApplication(String Passvalue) throws Exception
	{
		clickonSignIn();
		enterEmailAddress();
		enterPassword(Passvalue);
		clickonSignInbutton();
		clickonSignOut();
		
	}
	
	public void dataHybridLOGIN(String userName, String password) throws Exception
	{
		clickonSignIn();
		enterEmailAddress01(userName);
		enterPassword01(password);
		clickonSignInbutton();
		clickonSignOut();
		
	}
	
	
	
	
	
	
	
	
}
