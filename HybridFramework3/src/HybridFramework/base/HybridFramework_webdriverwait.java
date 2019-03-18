package HybridFramework.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;

import HybridFramework.base.HybridFramework_TestBase;

public class HybridFramework_webdriverwait extends HybridFramework_TestBase
{
	static ResourceBundle rb;
	WebDriver driver;
	
	public HybridFramework_webdriverwait()
	{
	  rb=ResourceBundle.getBundle("Config");
	}
	
	public int getPageLoadTimeOut()
	{
		return Integer.parseInt(rb.getString("PageLoadTimeOut"));
	}

	public int getImplicitWait()
	{
		return Integer.parseInt(rb.getString("ImplcitWait"));
	}

	public int getExplicitWait() 
	{
		return Integer.parseInt(rb.getString("ExplicitWait"));
	}
	
	
	
	
	
	
	
	
}
