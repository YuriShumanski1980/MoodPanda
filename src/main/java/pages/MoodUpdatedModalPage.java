package pages;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedModalPage {

    public static final String GO_TO_MY_DAIRY_BUTTON_CSS = ".ButtonMyDiary";
    public static final String CLICK_ON_BUTTON_DONE = ".btn.ButtonOk";

    public MyDairyPage clickGotoMyDiaryButton(){
        $(GO_TO_MY_DAIRY_BUTTON_CSS).click();
        return new MyDairyPage();
    }

    public FeedPage clickButtonDone() {
        $(CLICK_ON_BUTTON_DONE).click();
        return new FeedPage();
    }
}