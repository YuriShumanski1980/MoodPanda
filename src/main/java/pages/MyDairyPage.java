package pages;

import static com.codeborne.selenide.Selenide.$$;

public class MyDairyPage {

    public static final String MOOD_VALUE = ".badge.pull-right";

    public String getMyActualMood(){
        return $$(MOOD_VALUE).get(0).getText();
    }
}