package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class baseClass 
{
	 public WebDriver driver;
	 public Properties prop;
	  
     public void initializDriver() throws IOException
     {
    	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\Resources\\data.properties");
    	 
         prop= new Properties();
    	 
    	 prop.load(fis);
    	 
    	 String browserName=prop.getProperty("browser");
    	 
    	 if(browserName.equalsIgnoreCase("chrome"))
    	 {
    		 driver = new ChromeDriver();
    		 driver.manage().window().maximize();
    	 }
    	 
    	 else if(browserName.equalsIgnoreCase("firefox"))
    	 {
    		 driver = new FirefoxDriver();
    		 driver.manage().window().maximize();
    	 }
    	 
    	 else if(browserName.equalsIgnoreCase("edge"))
    	 {
    		 driver= new EdgeDriver();
    		 driver.manage().window().maximize();
    	 }
    	 
    	 else
    	 {
    		 System.out.println("Please select valid browser");
    	 }
     }
     
       @BeforeMethod
       public void urlLaunch() throws IOException
       {
    	   initializDriver();
    	   String urlName= prop.getProperty("url");
    	   driver.get(urlName);
       }
       
       @AfterMethod
       public void quitBrowser()
       {
    	   driver.quit();
       }
     
}
