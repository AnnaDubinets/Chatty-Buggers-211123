import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    private SelenideElement emailInput = $("[name=\"email\"]");

    private SelenideElement passwordInput = $("[name=\"password\"]");
    private SelenideElement confirmPasswordInput = $("[name=\"confirmPassword\"]");

    private SelenideElement registrationButton = $("#root > div > div > form > button");

    private SelenideElement adminButton = $("[value=\"admin\"]");

    private SelenideElement selectButton = $("#root > div > div > form > select");

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
        registrationButton.click();
    }

    public void clickOnSelectButton(){
        selectButton.click();
    }
    public void clickOnAdminButton(){
        adminButton.click();
    }
}

