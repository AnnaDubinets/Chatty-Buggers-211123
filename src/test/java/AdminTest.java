import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class AdminTest extends BaseTest{

    @Test
    public void checkUsersList(){


        loginPage.enterEmail("susan990@gmail.com");
        loginPage.enterPassword("susan990");
        loginPage.followLoginButton();
        sleep(5000);
        adminPage.chooseButtonClick();
        adminPage.clickOnAdminPanel();
        adminPage.checkUsersList("Users list");

    }
}
