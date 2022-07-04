package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage  extends TestBase{
	
	
	@FindBy(xpath = "//img[@alt='Kite']") private WebElement kiteLogo;
    @FindBy(xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogo;
    
    public LoginPage() // constructor
    {
    	PageFactory.initElements(driver, this);
    }	
    
    public String veriyTitle()
    {
    	return driver.getTitle();
    }
    
    public boolean verifykiteLogo()
    {
    	return kiteLogo.isDisplayed();
    }
	
	public boolean verifyzerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}
	
	
}
