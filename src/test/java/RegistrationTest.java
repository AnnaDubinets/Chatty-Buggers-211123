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
        postPage.userHeaderText("Hello, susan15! ▼");

    }

    @Test
    public void successRegistrationByUser(){
        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("anna97@gmail.com");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("annaanna970");
        registrationPage.clickOnRegistrationButton();

    }

    @Test
    public void invalidEmail(){
        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("anna97");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("susan970");
        registrationPage.clickOnRegistrationButton();
    }

    @Test
    public void emptyEmail(){
        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("annaanna970");
        registrationPage.clickOnRegistrationButton();
    }

    @Test
    public void invalidPasswordLessThanEight(){

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("anna78@gmail.com");
        registrationPage.enterPasswordValue("an970");
        registrationPage.enterConfirmPasswordValue("an970");
        registrationPage.clickOnRegistrationButton();

    }
    @Test
    public void emptyPassword(){

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("anna78@gmail.com");
        registrationPage.enterPasswordValue("");
        registrationPage.enterConfirmPasswordValue("an970");
        registrationPage.clickOnRegistrationButton();

    }

    @Test
    public void invalidUsernameLessThanThree(){

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("an");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("annaanna970");
        registrationPage.clickOnRegistrationButton();

    }

    @Test
    public void invalidUserNameMore20(){
        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("annaanna970annaanna970annaanna970");

        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("annaanna970");
        registrationPage.errorText("Incorrect email format");
    }

    @Test
    public void invalidConfirmPassword() {

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("susan970@gmail.com");
        registrationPage.enterPasswordValue("susan970");
        registrationPage.enterConfirmPasswordValue("mn");
        registrationPage.errorText("Passwords do not match");


    }
    @Test
    public void CheckHeaderLinks(){

        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.enterIntoClickOnHomeIn();
        postPage.enterIntoClickOnAboutIn();
        postPage.enterIntoClickOnContactIn();
        postPage.ClickOnHelloUsernameInHeader();
        postPage.opensAPopupForCreatingANewPost();

    }

}