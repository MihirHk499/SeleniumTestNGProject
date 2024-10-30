package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myInfoPageObject 
{
	public WebDriver driver;
	
	private By myinfotab= By.xpath("//span[normalize-space()='My Info']");
	
	private By employeefirstname= By.xpath("//input[@name='firstName']");
	
	private By employeemiddlename= By.xpath("//input[@name='middleName']");
	
	private By employeelastname= By.xpath("//input[@name='lastName']");
	
	private By employeeid= By.xpath("(//input[@data-v-1f99f73c=''])[5]");
	
	private By otherid= By.xpath("(//input[@data-v-1f99f73c=''])[6]");
	
	private By drivinglicense= By.xpath("(//input[@data-v-1f99f73c=''])[7]");
	
	private By nationalitydropdown= By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	
	private By selectcountry = By.xpath("//div[@data-v-d130bb63]");
	
	private By addbutton = By.xpath("(//button[@type='button'])[4]");
	
	private By browsebutton= By.xpath("//div[@class='oxd-file-button']");
	
	public myInfoPageObject(WebDriver driver3) 
	{
		this.driver=driver3;
	}

	public WebElement clickOnMyInfoTab()
	{
		return driver.findElement(myinfotab);
	}
	
	public WebElement enterEmployeeFirstName()
	{
		return driver.findElement(employeefirstname);
	}
	
	public WebElement enterEmployeeMiddleName()
	{
		return driver.findElement(employeemiddlename);
	}
	
	public WebElement enterEmployeeLastName()
	{
		return driver.findElement(employeelastname);
	}
	

	public WebElement enterEmployeeID()
	{
		return driver.findElement(employeeid);
	}
	
	public WebElement enterOtherID()
	{
		return driver.findElement(otherid);
	}
	
	public WebElement enterDrivingLicense()
	{
		return driver.findElement(drivinglicense);
	}
	
	public WebElement clickOnNationalityDropdown()
	{
		return driver.findElement(nationalitydropdown);
	}
	
	public List<WebElement> selectCountry()
	{
		return driver.findElements(selectcountry);
	}
	
	public WebElement clickOnAddButton()
	{
		return driver.findElement(addbutton);
	}
	
	public WebElement clickOnBrowserButton()
	{
		return driver.findElement(browsebutton);
	}
	
		
	
}

