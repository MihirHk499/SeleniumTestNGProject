package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class commonMethods 
{
    
	public void handleAssertion(String actual, String expected)
	{
		     SoftAssert sa= new SoftAssert();
	    	 
	    	 String actual_text=actual;
	    	
	         String expected_text= expected;
	         
	         sa.assertEquals(actual, expected);
	         
	         sa.assertAll();
	}
	
	public void handleDropdown(List<WebElement> a, String text)
	{
		    List<WebElement> obj= a;
		    int Size= obj.size();
		    for(int i=0;i<Size;i++)
		    {
		    	if(obj.get(i).getText().equalsIgnoreCase(text))
		    	{
		    		obj.get(i).click();
		    		break;
		    	}
		    }
	}
	
}
