package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {                   
	
	LoginPage login;
	@BeforeMethod
	
	public void setup() throws IOException
	{
		initilization();
		 login = new LoginPage();
	}
	
	@Test
	public void veriyTitle()
	{
		 String title = login.veriyTitle();
		 Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform", title);
	}
	
	@Test
	public void  verifykiteLogoTest()
	{
	 login.verifykiteLogo();
		
	}
	
	@Test
	public void verifyzerodhaLogoTest()
	{
		login.verifyzerodhaLogo();
	}
	
	

	@AfterMethod
	public void exit()
	{
	  driver.close();	
	}
	

}
