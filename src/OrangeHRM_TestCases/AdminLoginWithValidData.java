package OrangeHRM_TestCases;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Login_Page;
import Utils.UtilsDemo;

public class AdminLoginWithValidData extends UtilsDemo
{
    @Test
	public void CheckAdminLogin() 
	{
	
	   Login_Page san = PageFactory.initElements(driver, Login_Page.class);
	   san.Login("Admin", "Qedge123!@#");
	  boolean res = san.isAdminModuleDisplayed();
	   Assert.assertTrue(res);
	   san.Logout();
	   
	   
	   
	   
	   
	   
		
	}
	
	
}
