import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeEach
    public void setUp(){

        open("http://chatty.telran-edu.de:8089/login");
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }

    LoginPage loginPage = new LoginPage();
}
