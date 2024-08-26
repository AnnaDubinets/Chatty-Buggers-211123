import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AdminPage {
    private SelenideElement chooseButton = $("[class=\"dropdown-menu\"]");

    private SelenideElement adminPanelButton = $("[href=\"/users\"]");

    private SelenideElement headerUsersList = $("[data-test=\"usersListTitle\"]");

    private ElementsCollection usersList = $$("[data-test=\"usersTable\"]");

    public void chooseButtonClick() {
        chooseButton.click();
    }

    public void clickOnAdminPanel() {
        adminPanelButton.click();
    }

    public void checkUser(String expectedText){
        headerUsersList.shouldHave(text(expectedText));
    }

    public void checkUsersList() {
        //headerUsersList.shouldHave(text(expectedText));
        for (SelenideElement userList : usersList) {
            userList.isDisplayed();
        }
    }
}


