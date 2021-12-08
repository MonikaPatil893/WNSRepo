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
	public void checkArticle()
	{
			
		loadURL();
		driver = getDriver();
		
		moneyDashPage =PageFactory.initElements(driver, MoneyCorpDashboardPage.class);
		moneyDashPage.isOnDashBoardPage();
		moneyDashPage.changeLanguageAndRegion();
		moneyDashPage.isLanguageConversionDone();
		moneyDashPage.findMoreForeignExchangeSolution();
		
		forExgPage = PageFactory.initElements(driver, ForeignExchangePage.class);
		forExgPage.isOnForeignExchangePage();
		forExgPage.searchForInternationalPayment();
		forExgPage.checkForFilteredPage();
		forExgPage.checkForArticleLink();
		
	}
}
