package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.loginPageObject;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class loginTestCases extends baseClass
{
	 @Test
     public void verifyValidLogin() throws IOException, InterruptedException
     {
    	
    	 Thread.sleep(3000);
    	 loginPageObject lpo= new loginPageObject(driver);
    	 
    	 lpo.enterUsername().sendKeys(constants.username);
    	 
    	 lpo.enterPassoword().sendKeys(constants.password);
    	 
    	 lpo.clickOnLoginButton().click();
    	 
         commonMethods cm= new commonMethods();
         Thread.sleep(5000);
         cm.handleAssertion(lpo.validLoginText().getText(), "Dashboard");
    	 
    	 
    	 
    	
     }
	 
	 @Test
	 public void verifyInvalidLogin() throws IOException, InterruptedException
	 {
		  	 
    	 Thread.sleep(3000);
    	 loginPageObject lpo= new loginPageObject(driver);
    	 
    	 lpo.enterUsername().sendKeys(constants.invalidusername);
    	 
    	 lpo.enterPassoword().sendKeys(constants.password);
    	 
    	 lpo.clickOnLoginButton().click();
    	 
    	 commonMethods cm= new commonMethods();
    	 Thread.sleep(5000);
    	 cm.handleAssertion(lpo.inValidlogintext().getText(), "Invalid credentials");
    	 
         
	 }
}
