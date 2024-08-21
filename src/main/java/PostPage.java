import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PostPage {

    private SelenideElement createPostButton = $("[data-test=\"post-header__plus\"]");

    private SelenideElement titleField = $("[name=\"title\"]");

    private SelenideElement descpritionField = $("[placeholder=\"Description\"]");

    private SelenideElement contentField = $("[placeholder=\"My thoughts. No more than 1000 characters\"");

    private SelenideElement submitButton = $("[data-test=\"submit\"]");

    public void clickOnCreateButton(){
        createPostButton.click();
    }

    public void enterTitlePost(String titleValue){
        titleField.setValue(titleValue);
    }

    public void enterDescriptionPost(String descriptionValue){
        descpritionField.setValue(descriptionValue);
    }

    public void enterContentPost(String contentValue){
        contentField.setValue(contentValue);
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }

}
