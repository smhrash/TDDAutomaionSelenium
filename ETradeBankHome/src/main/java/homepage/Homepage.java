package homepage;


import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static homepage.WebElements.*;

public class Homepage extends WebAPI {

    @FindBy(xpath = webElementAccountTypesMenu)
    private WebElement accountTypesMenu;
    @FindBy(how = How.XPATH,using = webElementCorePortfoliosLink)
    public WebElement corePortfoliosLink;
    @FindBy(how = How.XPATH,using = webElementMeetCorePortfoliosText)
    public WebElement meetCorePortfoliosText;
    @FindBy(how = How.XPATH,using = webElementLogonMenu)
    private WebElement logonMenu;
    @FindBy(how = How.XPATH, using = webElementUsernameField)
    private WebElement usernameField;
    @FindBy(how = How.XPATH, using = webElementPasswordField)
    private WebElement passwordField;



    public void mouseHooverOnAccountTypes(){

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(accountTypesMenu));
                Actions action = new Actions(driver);
        action.moveToElement(accountTypesMenu).build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickOnCorePortfolios(){
        WebDriverWait wait = new WebDriverWait(driver,30);

        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(corePortfoliosLink));

        clickOnElement(corePortfoliosLink);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public String meetCorePortfoliosText(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.visibilityOf(meetCorePortfoliosText));

        return meetCorePortfoliosText.getText();
    }
    public void clickOnLogon(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .until(ExpectedConditions.elementToBeClickable(logonMenu));

        clickOnElement(logonMenu);


    }
    public  String logonPageTitle(){

        return driver.getTitle();

    }



}
