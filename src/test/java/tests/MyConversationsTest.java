package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MyConversationsTest extends BaseTest {

    public static final String MY_CONVERSATION_PAGE = ".media-content.rounded-top-corner";

    @Test(description = "My conversations page")
    public void myConversationsTest() {
        loginPage
                .openPage()
                .login(LOGIN, PASSWORD);
        myConversationPage
                .openConversationPage();
        $(MY_CONVERSATION_PAGE).shouldHave(text("My conversations"));
    }
}