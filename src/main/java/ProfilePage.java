import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    private SelenideElement usernameHeader = $("[data-test=\"profileEmail\"]");
    private SelenideElement editProfileIcon = $("[data-test=\"post-header__plus\"]");
    private SelenideElement nameInputField = $("[placeholder=\"Name\"]");
    public void usernameOnProfileCheck(String expectedText){
        usernameHeader.shouldHave(text(expectedText));
    }
    public void editProfileCheck(){
        editProfileIcon.click();
    }
    public void nameInputIsEnabled(){
        nameInputField.isEnabled();
    }
}
