import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AdminPage {
    private SelenideElement chooseButton = $("[class=\"dropdown-menu\"]");

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
