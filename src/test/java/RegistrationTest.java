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
        registrationPage.enterEmailValue("anna57@gmail.com");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("annaanna970");
        registrationPage.clickOnRegistrationButton();
        postPage.userHeaderText("Hello, anna57! ▼");

    }

    @Test
    public void invalidEmail(){
        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("anna97");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("susan970");
        //registrationPage.clickOnRegistrationButton();
        registrationPage.errorText("Incorrect email format");
    }

    @Test
    public void emptyEmail(){
        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("annaanna970");
        //registrationPage.clickOnRegistrationButton();
        registrationPage.errorText("Email cannot be empty");
    }

    @Test
    public void invalidPasswordLessThanEight(){

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("anna78@gmail.com");
        registrationPage.enterPasswordValue("an970");
        registrationPage.enterConfirmPasswordValue("an970");
        //registrationPage.clickOnRegistrationButton();
        registrationPage.errorText("Password must be 8-100 characters and include at least one letter and one digit");

    }
    @Test
    public void emptyPassword(){

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("anna78@gmail.com");
        registrationPage.enterPasswordValue("");
        registrationPage.enterConfirmPasswordValue("an970");
        //registrationPage.clickOnRegistrationButton();
        registrationPage.errorText("Password cannot be empty");

    }

    @Test
    public void invalidUsernameLessThanThree(){

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("an");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("annaanna970");
        //registrationPage.clickOnRegistrationButton();
        registrationPage.errorText("Incorrect email format");

    }

    @Test
    public void invalidUserNameMore20(){
        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("annaanna970annaanna970annaanna970");
        registrationPage.enterPasswordValue("annaanna970");
        registrationPage.enterConfirmPasswordValue("annaanna970");
        //registrationPage.clickOnRegistrationButton();
        registrationPage.errorText("Incorrect email format");
    }

    @Test
    public void invalidConfirmPassword() {

        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("susan970@gmail.com");
        registrationPage.enterPasswordValue("susan970");
        registrationPage.enterConfirmPasswordValue("mn");
        //registrationPage.clickOnRegistrationButton();
        registrationPage.errorText("Passwords do not match");


    }
    @Test
    public void alreadyUsedUsername() {
        loginPage.followSignUpLink();
        registrationPage.enterEmailValue("anna97@gmail.com");
        registrationPage.enterPasswordValue("susan970");
        registrationPage.enterConfirmPasswordValue("susan970");
        registrationPage.clickOnRegistrationButton();
        registrationPage.errorText("Email already exists!");

    }
}

