package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import UIPages.ForeignExchangePage;
import UIPages.MoneyCorpDashboardPage;

public class UIScenarioTestCase extends BaseClass
{
	public WebDriver driver;
	private ForeignExchangePage forExgPage;
	private MoneyCorpDashboardPage moneyDashPage;
	
	@Test
	//Loading the pages Moneydashboard and Foreignexchnage page and executing the methods sequentially.
	
	public void checkArticle()
	{
			
		loadURL();
		driver = getDriver();
		
		moneyDashPage =PageFactory.initElements(driver, MoneyCorpDashboardPage.class);//Instantiating MoneyCorpDashboardPage and passing driver oject to its constructor)
		moneyDashPage.isOnDashBoardPage();//verifying moneydashboard page is displayed
		moneyDashPage.changeLanguageAndRegion();//Changing the language and region page is displayed
		moneyDashPage.isLanguageConversionDone();//Verifying the Languageconversion
		moneyDashPage.findMoreForeignExchangeSolution();//Clicking on Find more option of Foreign exechange page
		
		forExgPage = PageFactory.initElements(driver, ForeignExchangePage.class);//Instantiating foreignexchangepage and passing driver oject to its constructor)
		forExgPage.isOnForeignExchangePage();//Verifying the ForeignexchangePage displayed
		forExgPage.searchForInternationalPayment();//Searching for the international payment  
		forExgPage.checkForFilteredPage();//Verifying the Filter page verification
		forExgPage.checkForArticleLink();//Verify the each article on international paymnet filter
		
	}
}
