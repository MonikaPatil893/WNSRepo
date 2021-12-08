
//This class contains page objects and reusable methods for foreignExchangePage which will get used in the test scripts.
package UIPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import TestCases.CustomUtility;

public class ForeignExchangePage extends CustomUtility
{
	private WebDriver driver;
	
	public ForeignExchangePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Page factory has been used for Page object identification
	
	@FindBy(how = How.XPATH, using = "//h1[text()=\"Foreign exchange solutions for your business\"]") WebElement foreignExchangePage;
	@FindBy(how = How.XPATH, using = "//button[@class=\"navigation-search icon\"]") WebElement SearchButton;
	@FindBy(how = How.CSS, using = "#nav_search") WebElement SearchBar;
	@FindBy(how = How.XPATH, using = "//input[@value=\"international payments\"]") WebElement InternationalPaymentFilter;
	@FindBy(how = How.XPATH, using = "//div[@class=\"results-wrapper\"]/div/div[2]/a") List<WebElement> articleLinks;
	
	//Verifying the ForeignexchangePage displayed
	public void isOnForeignExchangePage()
	{
		Assert.assertTrue(foreignExchangePage.isDisplayed());
	}
	
	//Searching for the international payment  
	public void searchForInternationalPayment()
	{
		jsClick(SearchButton);
		jsClick(SearchBar);
		SearchBar.sendKeys("international payments");
		
		try {
			Robot ro=new Robot();
			ro.keyPress(KeyEvent.VK_ENTER);	
		} catch (AWTException e) {
			e.printStackTrace();
		
		}
	}
	
	//Verifying the Filter page verification
	public void checkForFilteredPage()
	{
		Assert.assertTrue(InternationalPaymentFilter.isDisplayed());
	}
	
	//Verify the each article on international paymnet filter
	public void checkForArticleLink()
	{
		String parent=driver.getWindowHandle();
		
		try
		{
		Actions action =new Actions(driver); 
		
		for(WebElement articleLink:articleLinks)
		{
			action.keyDown(Keys.CONTROL).click(articleLink).keyUp(Keys.CONTROL).build().perform();
			Set<String> multipleWindow=driver.getWindowHandles();
			Iterator<String> I1= multipleWindow.iterator();
			while(I1.hasNext())
			{
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				String childUrl = driver.switchTo().window(child_window).getCurrentUrl();
				driver.close();
				
				if(childUrl.contains("https://www.moneycorp.com/en-us/"))
					Assert.assertTrue(true);
				else
					Assert.assertTrue(false);
			}
			}
		}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
