package TestCases;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class BaseClass 
{
	public static WebDriver driver;
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void loadURL()
	{
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	    driver =new ChromeDriver(ops);
	    String url = "https://www.moneycorp.com/en-gb/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void quitDriver()
	{
		driver.quit();
	}
}
