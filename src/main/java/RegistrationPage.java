import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    private SelenideElement emailInput = $("[name=\"email\"]");

    private SelenideElement passwordInput = $("[name=\"password\"]");
    private SelenideElement confirmPasswordInput = $("[name=\"confirmPassword\"]");

    private SelenideElement registrationButton = $("[class=\"registration-btn\"]");

    private SelenideElement adminButton = $("[value=\"admin\"]");


    private SelenideElement selectButton = $("select");

    private SelenideElement chooseButton = $("//*[@id=\"root\"]/div[1]/div/div/div[2]/p");

    private SelenideElement adminPanelButton = $("[href=\"/users\"]");

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

        registrationButton.shouldBe(enabled, Duration.ofSeconds(10)).click();
    }

    public void selectAdminRoleByClick() {
        selectButton.shouldBe(visible).click();
        adminButton.shouldBe(visible).click();
    }
    public void clickOnChooseButton(){
        chooseButton.click();
    }
    public void followAdminPanel(){
        adminPanelButton.click();
    }
}

