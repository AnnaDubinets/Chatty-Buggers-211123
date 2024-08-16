import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {


    @Test
    public void successLogin(){

        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();

    }
}
