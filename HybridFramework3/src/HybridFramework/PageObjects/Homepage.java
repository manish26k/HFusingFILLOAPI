package HybridFramework.PageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HybridFramework.base.HybridFramework_ObjectBase;
import HybridFramework.base.HybridFramework_TestBase;
import HybridFramework.base.HybridFramework_webdriverwait;
import HybridFramework.helper.HybridFramework_Wait;


public class Homepage extends HybridFramework_ObjectBase
{
	
	
	public WebElement SignInelement= driver.findElement(By.cssSelector(rbelement.getString("SignIn")));
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		rbelement=ResourceBundle.getBundle("Element");
		rb=ResourceBundle.getBundle("Config");
		wait=new HybridFramework_Wait(driver);
		//HybridFramework_TestBase HTB= new HybridFramework_TestBase();
		wait.waitForElement(driver,SignInelement, new HybridFramework_webdriverwait().getExplicitWait());
		
	}
	
	
	
	
   
}


