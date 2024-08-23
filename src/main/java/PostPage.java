import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PostPage {

    private SelenideElement createPostButton = $("[data-test=\"post-header__plus\"]");

    private SelenideElement titleField = $("[name=\"title\"]");

    private SelenideElement descpritionField = $("[placeholder=\"Description\"]");

    private SelenideElement contentField = $("[placeholder=\"My thoughts. No more than 1000 characters\"");

    private SelenideElement submitButton = $("[data-test=\"submit\"]");

    private SelenideElement postPhoto = $("[class=\"post-photo\"]");
    private SelenideElement postTitleLink = $("#root > div.home-blog.home-page > div.posts > div.container > div > div:nth-child(1) > div.post-content > div.post-content__top > h3");

    private SelenideElement userHeader = $("[class=\"header__user header__menu\"]");
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

    public void postImageIsDisplayed(){
        postPhoto.isDisplayed();
    }

    public void followPost(){
        postTitleLink.click();
    }
    public void userHeaderText(String expectedText){
        userHeader.shouldHave(text(expectedText));
    }

}
