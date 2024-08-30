import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static java.awt.SystemColor.text;

public class ContactPage {

    private SelenideElement nameField = $("[id=\"name\"]");

    private SelenideElement emailField = $("[id=\"email\"]");

    private SelenideElement messageField = $("[id=\"content\"]");

    private SelenideElement sendMessageButton = $("[type=\"submit\"]");

    private SelenideElement successSend = $("[class=\"success-message\"]");

    public void enterName(String nameValue) {
        nameField.setValue(nameValue);
    }

    public void enterEmail(String emailValue) {
        emailField.setValue(emailValue);
    }

    public void messageEmail(String messageValue) {
        messageField.setValue(messageValue);
    }

    public void clickSendMessage(){
        sendMessageButton.click();
    }

    public void successSendMessage(String expectedText){
        successSend.shouldHave(Condition.text(expectedText));
    }
    public void successMessageIsNotDisplayed(){
        successSend.shouldNotBe(visible);
    }
}
