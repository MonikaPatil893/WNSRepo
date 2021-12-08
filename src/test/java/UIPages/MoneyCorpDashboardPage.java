//This class contains page objects and reusable methods for Moneycorpdashboard page which will get used in the test scripts.
package UIPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import TestCases.CustomUtility;

public class MoneyCorpDashboardPage extends CustomUtility
{
	private WebDriver driver;
	
	public MoneyCorpDashboardPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "(//ul/li/div)/button[1]") WebElement languageArrow;
	@FindBy(how = How.XPATH, using = "//ul/li/a/span[text()=\"USA\"]") WebElement language;
	@FindBy(how = How.XPATH, using = "//h3[text()=\"Foreign exchange solutions\"]/following-sibling::a/span") WebElement FindMoreButton;
	
	//verifying moneydashboard page is displayed
	public void isOnDashBoardPage()
	{
		Assert.assertEquals(driver.getTitle(),"International Payments & Currency Exchange | moneycorp");
	}
	
	//Changing the language and region page is displayed
	public void changeLanguageAndRegion()
	{
		jsClick(languageArrow);
		jsClick(language);
		
	}
	
	public void isLanguageConversionDone()
	{
		String currentUrl =driver.getCurrentUrl();
		if(currentUrl.contains("en-us"))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}
	
	//Clicking on Find more option of Foreign exechange page
	public void findMoreForeignExchangeSolution()
	{
		jsClick(FindMoreButton);
	}
	

}
