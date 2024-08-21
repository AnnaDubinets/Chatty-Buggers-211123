import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationTest extends BaseTest {

    @Test
    public void successRegistrationByAdmin(){
        sleep(3000);
        loginPage.followSignUpLink();

        registrationPage.enterEmailValue("susan970@gmail.com");
        registrationPage.enterPasswordValue("susan970");
        registrationPage.enterConfirmPasswordValue("susan970");
        registrationPage.selectAdminRoleByClick();
        registrationPage.clickOnRegistrationButton();



    }

    @Test
    public void successRegistrationByUser(){

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("anna97@gmail.com");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("susan970");
        registrationPage.clickOnRegistrationButton();

    }

}
