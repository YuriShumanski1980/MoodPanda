package pages;

import com.codeborne.selenide.Condition;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class FeedPage {

    public static final String UPDATE_MOOD_BUTTON_CSS = "#LinkUpdate";
    public static final String FEED_URL = "https://moodpanda.com/Feed/?Me=1";
    public static final String OPEN_MY_CONVERSATION_PAGE = ".btn.btn-primary";

    public RateYourHappinessModalPage clickOnUpdateMoodButton(){
        $(UPDATE_MOOD_BUTTON_CSS).click();
        return new RateYourHappinessModalPage();
    }

    public FeedPage waitForMoodButtonVisible() {
        $(UPDATE_MOOD_BUTTON_CSS).shouldBe(Condition.visible, Duration.ofSeconds(10));
        return this;
    }

    public FeedPage openFeedPage() {
        open(FEED_URL);
        return this;
    }
}