import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PostPage {

    private SelenideElement createPostButton = $("[data-test=\"post-header__plus\"]");

    private SelenideElement titleField = $("[name=\"title\"]");

    private SelenideElement descpritionField = $("[placeholder=\"Description\"]");

    private SelenideElement contentField = $("[placeholder=\"My thoughts. No more than 1000 characters\"");

    private SelenideElement submitButton = $("[data-test=\"submit\"]");

    private SelenideElement postPhoto = $("[class=\"post-photo\"]");
    private SelenideElement postTitleLink = $("#root > div.home-blog.home-page > div.posts > div.container > div > div:nth-child(1) > div.post-content > div.post-content__top > h3");

    private SelenideElement userHeader = $("[class=\"header__user header__menu\"]");

    private SelenideElement titleErrorText = $("#root > div.home-blog.home-page > div.post-form__section.active > div > form > div:nth-child(1) > p");

    private SelenideElement postErrorText = $("[class=\"error\"]");

    private ElementsCollection postErrors  = $$("[class=\"error\"]");

    private SelenideElement draftboxCheckButton = $("[ for=\"draftCheckbox\"]");

    private SelenideElement myDraftsButton = $("#root > div.home-blog.home-page > div.left-side > div > div > div > div.menu > a:nth-child(2) > span");

    private SelenideElement myPostsTumbler = $("[for=\"myPostsId\"]");
    private ElementsCollection postAuthors = $$("[class=\"post-user__top\"]");
    private ElementsCollection postsPhotos = $$("[class=\"post-photo\"]");
    private ElementsCollection postsTitles = $$("[class=\"post-content__top\"]");
    private ElementsCollection postsDescriptions = $$("[class=\"post__description\"]");

    private SelenideElement uploadImage = $("[class=\"post_uploaded_image__7qSWV\"]");

    private SelenideElement errorTextCreatePost = $("[class=\"error\"]");
    private SelenideElement myProfileButton = $("[href=\"/userprofile\"]");

    private SelenideElement errorTextFormatImage = $("[class=\"post_error_message__FQTrb\"]");
    private SelenideElement firstPostTitle = $(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/h3"));


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

    public void titleErrorMessage(String expectedText){
        titleErrorText.shouldHave(text(expectedText));
    }

    public void onlyTitleErrorMessage(String expectedMessage){
        postErrorText.shouldHave(text(expectedMessage));
    }

    public void errorMessagesTextsCheck(List<String> expectedErrorTexts) {
        for (int i = 0; i < expectedErrorTexts.size(); i++) {
            postErrors.get(i).shouldHave(text(expectedErrorTexts.get(i)));


        }
    }

    public void clickOnDraftboxButton(){
        draftboxCheckButton.click();
    }

    public void clickOnMyDrafts(){
        myDraftsButton.click();
    }

    public void clickOnMyPostsTumbler(){
        myPostsTumbler.click();
    }

    public void postsAuthorsCheck(String expectedText){
        for (SelenideElement postAuthor: postAuthors
        ) {postAuthor.shouldHave(text(expectedText));

        }
    }
    public void postsTitlesAreDisplayedCheck(){
        for (SelenideElement postTitle: postsTitles){
            postTitle.isDisplayed();
        }
    }
    public void postsDescriptionsAreDisplayedCheck(){
        for (SelenideElement postDescription: postsDescriptions){
            postDescription.isDisplayed();//shouldBe(visible)
        }
    }
    public void postsPhotosAreDisplayedCheck(){
        for (SelenideElement postPhoto: postsPhotos){
            postPhoto.isDisplayed();
        }
    }

    public void uploadedImagePost(){
        File invalidFile = new File("\"C:\\Users\\Acer\\Desktop\\7IsB.gif\"");
        uploadImage.uploadFile(invalidFile);
    }

    public void checkIncorrectFormat(String expectedText){
        errorTextFormatImage.shouldHave(text(expectedText));
    }

    public void checkErrorTextCreatePost (String expectedText){
        errorTextCreatePost.shouldHave(text(expectedText));
    }

    public void checkNewPostTitle(String expectedText){
        postsTitles.findBy(text(expectedText));
    }
    public void clickOnUsersHeader(){
        userHeader.click();
    }

    public void clickOnMyProfile(){
        myProfileButton.click();
    }

    public void checkMyPostsButton(String expectedText){
        myPostsTumbler.shouldHave(text(expectedText));
    }



    public void opensAPopupForCreatingANewPost() {
    }

    public void opensApopupForCreatingANewPost() {
    }

    public void enterIntoClickOnHomeIn() {
    }

    public void enterIntoClickOnAboutIn() {
    }

    public void enterIntoClickOnContactIn() {
    }

    public void ClickOnHelloUsernameInHeader() {
    }
    public void openFirstPost() {
        firstPostTitle.click();
    }

    public void checkTextInTitles() {
        boolean notContainsText = true;
        for(SelenideElement postTitle:postsTitles){
            if (postTitle.getText().contains("My project 2")){
                notContainsText = false;
                break;
            }
        }
        //return notContainsText;
        if (notContainsText){
            System.out.println("There is no element with text: My project 2 ");

        }
        else {
            System.out.println("There is element with text");
        }
    }

    public void checkDraftPostTitleInDisplayedPosts() {
        boolean notContainsText = true;
        for(SelenideElement postTitle:postsTitles){
            if (postTitle.getText().contains("Good vibes3")){
                notContainsText = false;
                break;
            }
        }
        //return notContainsText;
        if (notContainsText){
            System.out.println("There is no element with text: Good vibes3 ");

        }
        else {
            System.out.println("There is element with text: Good vibes3");
        }
    }
}


