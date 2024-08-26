import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    private SelenideElement signUpButton = $("[href=\"/registration\"]");


    private SelenideElement emailInput = $("[name=\"email\"]");

    private SelenideElement passwordInput = $("[name=\"password\"]");

    private SelenideElement loginButton = $("[class=\"registration-btn\"]");
    private SelenideElement emailErrorText = $("#root > div > div > form > div:nth-child(3)");
    private SelenideElement passwordErrorText = $("#root > div > div > form > div:nth-child(5)");


    public void enterEmail(String emailValue) {
        emailInput.setValue(emailValue);
    }

    public void enterPassword(String passwordValue) {
        passwordInput.setValue(passwordValue);
    }

    public void followLoginButton() {
        loginButton.click();
    }

    public void followSignUpLink() {
        signUpButton.click();
    }
    public void wrongEmailErrorTextCheck(String expectedText){
        emailErrorText.shouldHave(text(expectedText));
    }

    public void wrongPasswordErrorTextCheck(String expectedText){
        passwordErrorText.shouldHave(text(expectedText));
    }

}
