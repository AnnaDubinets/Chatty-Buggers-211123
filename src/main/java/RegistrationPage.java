import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    private SelenideElement emailInput = $("[name=\"email\"]");

    private SelenideElement passwordInput = $("[name=\"password\"]");
    private SelenideElement confirmPasswordInput = $("[name=\"confirmPassword\"]");

    private SelenideElement registrationButton = $("[class=\"registration-btn\"]");

    private SelenideElement adminButton = $("[value=\"admin\"]");


    private SelenideElement selectButton = $("select");

    private SelenideElement emailErrorText = $("[class=\"text-error\"]");


    private SelenideElement passwordErrorText = $("[class=\"text-error\"]");



    public void enterEmailValue(String emailValue) {
        emailInput.setValue(emailValue);
    }

    public void enterPasswordValue(String passwordValue) {
        passwordInput.setValue(passwordValue);
    }

    public void enterConfirmPasswordValue(String confirmPasswordValue) {
        confirmPasswordInput.setValue(confirmPasswordValue);

    }

    public void clickOnRegistrationButton() {

        registrationButton.shouldBe(visible, Duration.ofSeconds(10))
                .shouldBe(enabled, Duration.ofSeconds(15))
                .click();
    }

    public void selectAdminRoleByClick() {
        selectButton.click();
        adminButton.click();
    }

    public void errorText(String expectedText){
        emailErrorText.shouldHave(text(expectedText));
    }


    public void errorTextInvalidEmail(String expectedText){
        emailErrorText.shouldHave(text(expectedText));
    }


    public void passwordErrorTest(String expectedText){
        passwordErrorText.shouldHave(text(expectedText));
    }
}


