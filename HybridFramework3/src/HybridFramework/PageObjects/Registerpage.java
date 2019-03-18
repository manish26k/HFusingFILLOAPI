package HybridFramework.PageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HybridFramework.base.HybridFramework_ObjectBase;
import HybridFramework.base.HybridFramework_TestBase;
import HybridFramework.base.HybridFramework_webdriverwait;
import HybridFramework.helper.HybridFramework_Wait;

public class Registerpage extends HybridFramework_ObjectBase
{
	
	
	public Registerpage(WebDriver driver) throws Exception
	{
				
		this.driver=driver;
				
		rbelement=ResourceBundle.getBundle("Element");
		rb=ResourceBundle.getBundle("Config");
		
		WebElement MrRadiobutton= getWebElement("MrRadiobutton");
				
		
		wait=new HybridFramework_Wait(driver);
		
		wait.waitForElement(driver,MrRadiobutton, new HybridFramework_webdriverwait().getExplicitWait());
		
	}
	
	public void selectMrRadiobutton() throws Exception{
		 getWebElement("MrRadiobutton").click();
		
	}
	
	public void setFirstname(String Fname) throws Exception{
		getWebElement("FirstName").sendKeys(Fname);
		
	}
	
	public void setLastname(String Lname) throws Exception{
		getWebElement("LastName").sendKeys(Lname);
		
	}
	
	public void setPassword(String Passwd) throws Exception{
		getWebElement("Password").sendKeys(Passwd);
		
	}
	
	public void setDate(String days) throws Exception{
		List<WebElement> day= getWebElements("Days"); 
				//driver.findElements(By.cssSelector(rbelement.getString("Dayscss")));
		System.out.println(day.size());
		Iterator<WebElement> itr=day.iterator();
		while(itr.hasNext()){
			WebElement d= itr.next();
			String text= d.getText().trim().toString();
			System.out.println(text);
			if(text.equals(days)){
				d.click();
				break;
			}
		}
	}
	
	public void setMonth(String months) throws Exception{
		List<WebElement> month=getWebElements("Month");
				//driver.findElements(By.cssSelector(rbelement.getString("Monthcss")));
		Iterator<WebElement> itr=month.iterator();
		while(itr.hasNext()){
			WebElement m= itr.next();
			String text= m.getText().trim().toString();
			if(text.equals(months)){
				m.click();
				break;
			}
		}
	}
	
	public void setYear(String yrs) throws Exception{
		List<WebElement> year=getWebElements("Year");
				//driver.findElements(By.cssSelector(rbelement.getString("Yearcss")));
		Iterator<WebElement> itr=year.iterator();
		while(itr.hasNext()){
			WebElement y= itr.next();
			String text= y.getText().trim().toString();
			if(text.equals(yrs)){
				y.click();
				break;
			}
		}
	}
	
	
	public void setAddress(String address) throws Exception{
		getWebElement("Adress").sendKeys(address);
		
	}
	
	public void setCity(String city) throws Exception{
		getWebElement("City").sendKeys(city);
		
	}
	
	public void setState(String state) throws Exception{
		List<WebElement> st=getWebElements("State");
				//driver.findElements(By.cssSelector(rbelement.getString("Statecss")));
		Iterator<WebElement> itr=st.iterator();
		while(itr.hasNext()){
			WebElement s=itr.next();
			String text=s.getText().trim().toString();
			if(text.equals(state)){
				s.click();
			}
		}
	}
	
	public void setZipcode(String zip) throws Exception{
		getWebElement("Zipcode").sendKeys(zip);
		
	}
	
	public void setMobilephone(String mphone) throws Exception{
		getWebElement("Mobilephone").sendKeys(mphone);
		driver.findElement(By.cssSelector(rbelement.getString("Mobilephonecss"))).sendKeys(mphone);
	}
	public void setAddressalias(String addalias) throws Exception{
		getWebElement("aliasAddress").sendKeys(addalias);
		driver.findElement(By.cssSelector(rbelement.getString("aliasAddresscss"))).sendKeys(addalias);
	}
	public MyAccountpage clickonCreateAccountbutton() throws Exception{
		getWebElement("Register").click();
		
		return new MyAccountpage(driver);
	}
	
	
	public void registerIntoApplication(String Fname, String Lname, String Passwd, String days, String months, String yrs, String address, String city, String state, String zip, String mphone, String addalias) throws Exception{
		selectMrRadiobutton();
		setFirstname(Fname);
		setLastname(Lname);
		setPassword(Passwd);
		setDate(days);
		setMonth(months);
		setYear(yrs);
		setAddress(address);
		setCity(city);
		setState(state);
		setZipcode(zip);
		setMobilephone(mphone);
		setAddressalias(addalias);
		clickonCreateAccountbutton();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
