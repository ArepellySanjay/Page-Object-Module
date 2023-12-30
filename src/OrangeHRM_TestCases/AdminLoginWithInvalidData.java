package OrangeHRM_TestCases;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Login_Page;
import OrangeHRM_Pages.invalidLogin_page;
import Utils.UtilsDemo;

public class AdminLoginWithInvalidData extends UtilsDemo
{
 
	public void invalidLogin()  
	{
	
		invalidLogin_page san = PageFactory.initElements(driver, invalidLogin_page.class);
		san.invalid("dfh", "rhsr");
     boolean res =		san.isErrMesgDisplaye();
      Assert.assertTrue(res);
		
	}
}
 