package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	
	public String readProperties(String value) throws IOException
	{
		Properties pro = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\Akash\\eclipse-workspace12\\30PracticeaFramework\\src\\main\\java\\Config\\Config.properties");
		pro.load(file);
	return pro.getProperty(value);
	
	}
	
	
	
	public void initilization() throws IOException

	{
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
//		   driver.get("https://kite.zerodha.com/");
		driver.get(readProperties("url"));
		
		
	}
	
}
