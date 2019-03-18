package HybridFramework.PageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HybridFramework.base.HybridFramework_ObjectBase;
import HybridFramework.base.HybridFramework_TestBase;
import HybridFramework.base.HybridFramework_webdriverwait;
import HybridFramework.helper.HybridFramework_Wait;


public class MyAccountpage extends HybridFramework_ObjectBase
{
	
	public MyAccountpage(WebDriver driver) throws Exception
	{
		this.driver=driver;
		rbelement=ResourceBundle.getBundle("Element");
		rb=ResourceBundle.getBundle("Config");
		
		WebElement Signoutelement= getWebElement("SignOut");
				
		
		wait=new HybridFramework_Wait(driver);
		
		wait.waitForElement(driver,Signoutelement, new HybridFramework_webdriverwait().getExplicitWait());
		
	}
	
	
	
	

}
