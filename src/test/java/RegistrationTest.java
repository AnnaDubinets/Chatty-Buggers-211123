import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationTest extends BaseTest {

    @Test
    public void successRegistrationByAdmin(){
        sleep(3000);
        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("susan97@gmail.com");
        registrationPage.enterPasswordValue("susan97");
        registrationPage.enterConfirmPasswordValue("susan97");
        registrationPage.clickOnSelectButton();
        registrationPage.clickOnAdminButton();
        registrationPage.clickOnRegistrationButton();
        sleep(3000);


    }


}
