package HybridFramework.Testscases;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.relevantcodes.extentreports.LogStatus;

import HybridFramework.PageObjects.Loginpage;
import HybridFramework.base.HybridFramework_TestBase;

public class DataHybridLOGINTest extends HybridFramework_TestBase
{
	
	Loginpage loginpage;
	
	
    @DataProvider(name="testData")
	public Object[][] dataSource() throws FilloException
    {
	return getData("HybridFramework.xlsx","LoginTestData");
	
	}
    
    @Test(dataProvider="testData")
    public void testLogin(String userName, String password, String runMode) throws Exception {
    	System.out.println("------>"+userName+" "+password+" "+runMode);
    	
    	extentTest=extentReport.startTest("DataHybridLOGINTest");
    	
    	loginpage= new Loginpage(driver);
    	
    	if(runMode.equalsIgnoreCase("n")) {
    		throw new SkipException("Run Mode for this set of data is maked N");
    	}
    	
    	loginpage.dataHybridLOGIN(userName, password);
    	
    	 extentTest.log(LogStatus.PASS, "DataHybridLOGINTest Passed");
    	
    }
    	
    
	
	
	
}
