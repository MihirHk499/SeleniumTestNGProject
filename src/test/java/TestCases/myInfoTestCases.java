package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import PageObjectModel.loginPageObject;
import PageObjectModel.myInfoPageObject;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class myInfoTestCases extends baseClass 
{     
	  @Test
	 public void fillMyInfo() throws IOException, InterruptedException, AWTException
	 {
        Thread.sleep(3000);
	    loginPageObject lpo= new loginPageObject(driver);
	 
	    lpo.enterUsername().sendKeys(constants.username);
	 
	    lpo.enterPassoword().sendKeys(constants.password);
	 
	    lpo.clickOnLoginButton().click();
	    
	    myInfoPageObject mipo= new myInfoPageObject(driver);
	    
	    Thread.sleep(6000);
	    mipo.clickOnMyInfoTab().click();
	    
	    Thread.sleep(3000);
	    mipo.enterEmployeeFirstName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    mipo.enterEmployeeFirstName().sendKeys(constants.employeefirstname);
	    
	    Thread.sleep(3000);
	    mipo.enterEmployeeMiddleName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    mipo.enterEmployeeMiddleName().sendKeys(constants.employeemiddlename);
	    
	    Thread.sleep(3000);
	    mipo.enterEmployeeLastName().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    mipo.enterEmployeeLastName().sendKeys(constants.employeelastname);
	     
	    Thread.sleep(3000);
	    mipo.enterEmployeeID().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    mipo.enterEmployeeID().sendKeys(constants.employeeid);
	    
	    Thread.sleep(3000);
	    mipo.enterOtherID().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    mipo.enterOtherID().sendKeys(constants.otherid);
	    
	    Thread.sleep(3000);
	    mipo.enterDrivingLicense().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    mipo.enterDrivingLicense().sendKeys(constants.drivinglicense);
	    
	    Thread.sleep(3000);
	    mipo.clickOnNationalityDropdown().click();
	    
	    Thread.sleep(5000);
	    commonMethods cm= new commonMethods();
	    cm.handleDropdown(mipo.selectCountry(), "Indian");
	    
	    Thread.sleep(3000);
	    mipo.clickOnAddButton().click();
	    
	    Thread.sleep(3000);
	    mipo.clickOnBrowserButton().click();
	    
	   
	    Thread.sleep(6000);
	    setClipboardData("C:\\Users\\mihir\\Downloads\\Eclips IDE logo.jpg");
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_V);
    	robot.keyRelease(KeyEvent.VK_CONTROL);
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
	      
	 }
	  
	  public static void setClipboardData(String string) 
      {
	   StringSelection stringSelection = new StringSelection(string);
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	  }
}
