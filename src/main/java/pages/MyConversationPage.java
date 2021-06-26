package pages;

import static com.codeborne.selenide.Selenide.open;

public class MyConversationPage {

    public static final String CONVERSATION_URL = "https://moodpanda.com/Feed/?Inbox=1";

    public MyConversationPage openConversationPage() {
        open(CONVERSATION_URL);
        return new MyConversationPage();
    }
}