package OrangeHRM_TestCases;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Login_sanju;
import Utils.UtilsDemo;



public class sanju_Login extends UtilsDemo
{
    @Test
	public void AdminLogin() 
	{
		
		Login_sanju sanju = PageFactory.initElements(driver, Login_sanju.class);
		sanju.Login("Admin", "Qedge123!@#");
	boolean res =	sanju.isAdminloginDisplay();
		Assert.assertTrue(res);
		sanju.logout();
	}
	
}
