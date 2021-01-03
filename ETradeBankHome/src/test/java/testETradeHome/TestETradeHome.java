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
    public void getInIt(){
        homepage = PageFactory.initElements(driver,Homepage.class);
    }
    @Test(enabled = false)
    public void testExpectedText(){
        homepage.mouseHooverOnAccountTypes();
        homepage.clickOnCorePortfolios();
        String actualTest = homepage.meetCorePortfoliosText();
        Assert.assertEquals(actualTest, " ", "Expected Text Not Found");
    }
    @Test
    public void checkLogonPageTitle(){
        homepage.clickOnLogon();
        String actualTitle = homepage.logonPageTitle();
        Assert.assertEquals(actualTitle,"Log On to E*TRADE | E*TRADE Financial","Logon page title not found");

    }

}
