import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationTest extends BaseTest {

    @Test
    public void successRegistrationByAdmin(){

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("susan97@gmail.com");
        registrationPage.enterPasswordValue("susan97");
        registrationPage.enterConfirmPasswordValue("susan97");
        registrationPage.selectAdminRoleByClick();
        registrationPage.clickOnRegistrationButton();

    }


    @Test
    public void successRegistrationByUser(){

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("susan97@gmail.com");
        registrationPage.enterPasswordValue("susan97");
        registrationPage.enterConfirmPasswordValue("susan97");
        registrationPage.clickOnRegistrationButton();

    }

    @Test
    public void checkUsersList(){

        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        sleep(5000);
        profilePage.chooseButtonClick();
        profilePage.clickOnAdminPanel();

    }
}
