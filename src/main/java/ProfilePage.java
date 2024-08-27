import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    private SelenideElement usernameHeader = $("[data-test=\"profileEmail\"]");
    public void usernameOnProfileCheck(String expectedText){
        usernameHeader.shouldHave(text(expectedText));
    }
}
