import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {


    @Test
    public void successLogin(){

        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();

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
}
