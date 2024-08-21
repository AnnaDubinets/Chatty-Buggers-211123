import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.impl.Arguments;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;


public class BaseTest {


    @BeforeEach

    public void setUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("--disable-search-engine-choice-screen");



        open("http://chatty.telran-edu.de:8089/login");


    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }

    LoginPage loginPage = new LoginPage();

    RegistrationPage registrationPage = new RegistrationPage();

    AdminPage adminPage = new AdminPage();
}
