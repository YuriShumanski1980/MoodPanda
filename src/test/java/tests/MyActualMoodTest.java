package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

;

public class MyActualMoodTest extends BaseTest{

    @Test(description = "Check my actual mood")
    public void checkMyMoodOnFeedPageTest() {
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .clickOnUpdateMoodButton()
                .updateMood(8)
                .clickButtonDone();
        feedPage
                .openFeedPage();
        Assert.assertEquals(myDairyPage.getMyActualMood(), String.valueOf(8));
    }
}