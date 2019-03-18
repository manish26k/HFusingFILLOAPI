package HybridFramework.Testscases;

import org.testng.annotations.Test;

import HybridFramework.PageObjects.Loginpage;
import HybridFramework.PageObjects.Registerpage;
import HybridFramework.base.HybridFramework_TestBase;

public class RegisterPageTest  extends HybridFramework_TestBase {

	@Test
	public void testRegistertoApplication() throws Exception{
		
		Loginpage loginPage= new Loginpage(driver);
		loginPage.clickonSignIn();
		loginPage.enterRegisterEmail("NewEmail");
		loginPage.clickOnCreateAccount();
		
		Registerpage regPage= new Registerpage(driver);
		regPage.registerIntoApplication("Fname","Lname","@ut0m@t10n","5","July","1970","Street 10",
				"new york","Alaska","99501","1111111111","addressAlias");
		
		
	}
}
