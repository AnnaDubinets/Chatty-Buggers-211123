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

    }

    @Test
    public void invalidUserName(){

        loginPage.enterEmail("johnsmith-!");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
    }

    @Test
    public void invalidPassword(){

        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty");
        loginPage.followLoginButton();
    }

    @Test
    public void emptyFields(){

        loginPage.enterEmail("");
        loginPage.enterPassword("");
        loginPage.followLoginButton();
    }
    @Test
    public void invalidUsernameTwoSymbols(){

        loginPage.enterEmail("jo");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
    }

    @Test
    public void invalidUsernameMore20Symbols(){


        loginPage.enterEmail("johnsmithjohnsmithjohnsmithjohnsmith");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
    }
}
