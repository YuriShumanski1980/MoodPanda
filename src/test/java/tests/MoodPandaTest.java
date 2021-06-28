package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MoodPandaTest extends BaseTest {

    public final String MY_DIARY_PAGE_UPDATES = ".media-content.border-wide-10";

     @Test(description = "Logging in and going to the 'Diary of my mood' page. Logging & update my mood")
    public void loginTest() {
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD)
                .waitForMoodButtonVisible()
                .clickOnUpdateMoodButton()
                .updateMood(6)
                .clickGotoMyDiaryButton();
        $(MY_DIARY_PAGE_UPDATES).shouldHave(text("My updates"));
    }
}