package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    public static final String LOGIN = "shuma@mailinator.com";
    public static final String PASSWORD = "123456";

    LoginPage loginPage;
    FeedPage feedPage;
    RateYourHappinessModalPage rateYourHappinessModalPage;
    MyDairyPage myDairyPage;
    MyConversationPage myConversationPage;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 15000;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = false;
        loginPage = new LoginPage();
        feedPage = new FeedPage();
        rateYourHappinessModalPage = new RateYourHappinessModalPage();
        myDairyPage = new MyDairyPage();
        myConversationPage = new MyConversationPage();
    }

    @AfterMethod
    public void closeBrowser(){
        getWebDriver().quit();
    }
}