package OrangeHRM_TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_Pages.Login_Page;
import OrangeHRM_Pages.UserRegitrationPage;
import Utils.UtilsDemo;

public class userRegTest extends UtilsDemo
{

	@Test
	public void UserResgistration() 
	{
		Login_Page san = PageFactory.initElements(driver,Login_Page.class);
		san.Login("Admin", "Qedge123!@#");
		UserRegitrationPage sun =PageFactory.initElements(driver, UserRegitrationPage.class);
		sun.UserReg("ESS", "Suresh Babu", "sureedu", "Suri1263!@0#");
		san.Logout();
	}
	
}
