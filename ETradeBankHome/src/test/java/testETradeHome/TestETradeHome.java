package testETradeHome;


import commonAPI.WebAPI;
import homepage.Homepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestETradeHome extends WebAPI {

    Homepage homepage;

    @BeforeMethod
    public void getInIt() {
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test(enabled = false)
    public void testExpectedText() {
        homepage.mouseHooverOnAccountTypes();
        homepage.clickOnCorePortfolios();
        String actualTest = homepage.meetCorePortfoliosText();
        Assert.assertEquals(actualTest, "Meet Core Portfolios", "Expected Text Not Found");
    }

    @Test(enabled = false)
    public void checkLogonPageTitle() {
        homepage.clickOnLogon();
        String actualTitle = homepage.logonPageTitle();
        Assert.assertEquals(actualTitle, "Log On to E*TRADE | E*TRADE Financial", "Logon page title not found");

    }
    @Test
    public void testFormsAndApplicationsPageUrl(){
        homepage.clickOnFormsAndApplications();
        String actualUrl = homepage.formsAndApplicationsPageUrl();
        Assert.assertEquals(actualUrl,"https://us.etrade.com/forms-applications","Url not found");
    }

}
