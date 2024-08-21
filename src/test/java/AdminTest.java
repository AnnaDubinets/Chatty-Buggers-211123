import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class AdminTest extends BaseTest{

    @Test
    public void checkUsersList(){

        loginPage.followSignUpLink();

        registrationPage.enterEmailValue("annasusan978@gmail.com");
        registrationPage.enterPasswordValue("annasusan970");
        registrationPage.enterConfirmPasswordValue("annasusan970");
        registrationPage.selectAdminRoleByClick();
        registrationPage.clickOnRegistrationButton();
        sleep(5000);
        adminPage.chooseButtonClick();
        adminPage.clickOnAdminPanel();
        adminPage.checkUsersList("Users list");

    }
}
