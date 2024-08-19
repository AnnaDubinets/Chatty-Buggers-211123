import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {


    private SelenideElement signUpButton = $("[href=\"/registration\"]");


    private SelenideElement emailInput = $("[name=\"email\"]");

    private SelenideElement passwordInput = $("[name=\"password\"]");

    private SelenideElement loginButton = $("[class=\"registration-btn\"]");


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
}
