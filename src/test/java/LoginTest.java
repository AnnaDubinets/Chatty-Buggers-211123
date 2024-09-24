import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class LoginTest extends BaseTest {



    @Test
    public void successLogin(){
        sleep(3000);
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        sleep(3000);
        postPage.userHeaderText("Hello, johnsmith! ▼");
    }

    @Test
    public void invalidUserName(){
        loginPage.enterEmail("johnsmith-!");
        loginPage.enterPassword("qwerty07");
        loginPage.wrongEmailErrorTextCheck("Incorrect email");
    }

    @Test
    public void invalidPassword(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty099");

    }

    @Test
    public void emptyFields(){
        loginPage.enterEmail(" ");
        loginPage.enterPassword(" ");
        loginPage.wrongEmailErrorTextCheck("Incorrect email");
        loginPage.wrongPasswordErrorTextCheck("Password must be 8-100 characters and include at least one letter and one digit");
    }
    @Test
    public void invalidUsernameTwoSymbols(){
        loginPage.enterEmail("jo");
        loginPage.enterPassword("qwerty07");
        loginPage.wrongEmailErrorTextCheck("Incorrect email");
    }

    @Test
    public void invalidUsernameMore20Symbols(){
        loginPage.enterEmail("johnsmithjohnsmithjohnsmithjohnsmith");
        loginPage.enterPassword("qwerty07");
        loginPage.wrongEmailErrorTextCheck("Incorrect email");
    }
}