package test_cases;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Base_class;
import webpages.LandingPage;
import webpages.Register_page;

public class Test_cases extends Base_class {
  public WebDriver driver;

@Test
  public void 	landing_testcases()  {
	  
	  try
	  {
		  this.driver= launchapp(driver);
		  LandingPage LandingPage_obj = new LandingPage(driver);
			 clickButton(LandingPage_obj.Register_link,"Register_link");
			 Register_page Registerpage_obj = new Register_page(driver);
			 clickButton(Registerpage_obj.gender_female_rb,"gender_female_rb");
			 setText(Registerpage_obj.FirstName_tb,"xyz","FirstName_tb");
			 setText(Registerpage_obj.LastName_tb,"ymz","LastName_tb");
			 setText(Registerpage_obj.Email_tb,"xyzdg1@gmail.com","Email_tb");	
			 setText(Registerpage_obj.Password_tb,"abcdefgh","Password_tb");
			 setText(Registerpage_obj.ConfirmPassword_tb,"abcdefgh","ConfirmPassword_tb");
			
		  
	  }
	  
	  catch(Exception e)
	  {
		  e.printStackTrace();
		 
	  }
  
  }
  
  
  
  
}
