import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    private SelenideElement chooseButton = $("//*[@id=\"root\"]/div[1]/div/div/div[2]/p");

    private SelenideElement adminPanelButton = $("[href=\"/users\"]");

    private SelenideElement headerUsersList = $("[data-test=\"usersListTitle\"]");

    public void chooseButtonClick() {
        chooseButton.click();
    }

    public void clickOnAdminPanel() {
        adminPanelButton.click();
    }

    public void checkUsersList(String expectedText){
        headerUsersList.shouldHave(text(expectedText));
    }
}
