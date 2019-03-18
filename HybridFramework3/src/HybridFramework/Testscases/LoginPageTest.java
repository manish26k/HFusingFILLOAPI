package HybridFramework.Testscases;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import HybridFramework.PageObjects.Loginpage;
import HybridFramework.base.HybridFramework_TestBase;

public class LoginPageTest extends HybridFramework_TestBase
{
	

	public static Logger log=LogManager.getLogger(LoginPageTest.class.getName());
	
	@Test
	public void testloginToApplication() throws Exception
	{
		extentTest=extentReport.startTest("testloginToApplication");
		
		log.info("Loginpage intialiazed");
		Loginpage loginPage= new Loginpage(driver);
		
		log.info("loginToApplication method is called..");	
		loginPage.loginToApplication("Passval");
		
		 extentTest.log(LogStatus.PASS, "testloginToApplication Passed");
		
	}

}
