package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Base_class {

	
public  WebDriver launchapp(WebDriver driver)
{
	try
	{System.out.println("here");
		ReadWriteConfigFile prop = new ReadWriteConfigFile();
		String browserinconfig=	prop.getpropertfromconfig("browser");
		if(browserinconfig.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browserinconfig.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserinconfig.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","src\\test\\resources\\drivers\\IEDriverServer.exe");
			DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
            }
		String urlusing = prop.getpropertfromconfig("appurl");
		driver.get(urlusing);
		Reporter.log("Launching the url "+urlusing);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		 Assert.fail(e.getMessage());
	}
	
	finally
	{
		return driver;
	}
	
}
	public void setText(WebElement ele,String value,String fieldName)
	{
		try
		{
			ele.sendKeys(value);
			Reporter.log("Entered value "+value+" for the field "+fieldName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			 Assert.fail(e.getMessage());
		}
		
		
	}
	
	public void clickButton(WebElement cl,String fieldName)
	{
		try
		{
			cl.click();
			Reporter.log("Clicked "+fieldName);
		}
	catch(Exception e)
		{
		
	e.printStackTrace();
	 Assert.fail(e.getMessage());
	}
	}
	
		public void dropDownSelection(WebElement dd, String valueToSelect, String fieldname)
		{
			try
			{
				Select sel = new Select(dd);
				sel.selectByVisibleText(valueToSelect);
				Reporter.log("selected the drop down "+fieldname+" with value "+valueToSelect);
				System.out.println();
			}
			catch(Exception e)
			{
				
				e.printStackTrace();
				 Assert.fail(e.getMessage());
			}
		}
		
		}
	
	
	

