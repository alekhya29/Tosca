package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {
  WebDriver driver;

  public Register_page(WebDriver driver)
  { 
	  this.driver=driver;
		PageFactory.initElements(driver,this);
			
	}
	
	
	
	@FindBy(id="gender-male")
	public WebElement  gender_male_rb;
	
	@FindBy(id="gender-female")
	public WebElement  gender_female_rb;
	
	@FindBy(id="FirstName")
	public WebElement FirstName_tb;
	
	@FindBy(id="LastName")
	public WebElement LastName_tb;
	
	@FindBy(id="Email")
	public WebElement Email_tb;
	
	@FindBy(id="Password")
	public WebElement Password_tb;
	
	@FindBy(id="ConfirmPassword")
	public WebElement ConfirmPassword_tb;
	
	
	
	@FindBy(id="register-button")
	public WebElement register_button	;
	
	
	

	  
  }
