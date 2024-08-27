import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class PostTest extends BaseTest{

    @Test
    public void successCreatePost(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnCreateButton();
        postPage.enterTitlePost("Dogs&Cats");
        postPage.enterDescriptionPost("Summer is upon us! like this month’s book selection, A Cat and a Dog, written by Claire Masurel;");
        postPage.enterContentPost("Talk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:");
        postPage.clickOnSubmitButton();
        postPage.checkNewPostTitle("Dogs&Cats");

    }


    @Test
    public void invalidDescription(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnCreateButton();
        postPage.enterTitlePost("Cats&Dogs");
        postPage.enterDescriptionPost("Summer is upon us! like this month’s book selection,Summer is upon us! like this month’s book selection,Summer is upon us! like this month’s book selection, A Cat and a Dog, written by Claire Masurel;");
        postPage.enterContentPost("Talk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:");
        postPage.clickOnSubmitButton();
        postPage.checkErrorTextCreatePost("Please fill all fields");
    }

    @Test
    public void invalidContent(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnCreateButton();
        postPage.enterTitlePost("Cats&Dogs");
        postPage.enterDescriptionPost("Summer is upon us! like this month’s book selection, A Cat and a Dog, written by Claire Masurel;");
        postPage.enterContentPost("Talk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:\n" +
                "\n" +
                "“Dogs have soft fur and tails, so do cats! Do cats like to chase their tails?”\n" +
                "\n" +
                "“Cats have short pointy ears, how do dog’s ears look?”\n" +
                "\n" +
                "Cat and Dog may not like each other in the beginning of the story and prefer to be alone, but all pets need love. Talk about how to care for pets and how we can show our pets we love them. For exampleTalk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:\n" +
                "\n" +
                "“Dogs have soft fur and tails, so do cats! Do cats like to chase their tails?”\n" +
                "\n" +
                "“Cats have short pointy ears, how do dog’s ears look?”\n" +
                "\n" +
                "Cat and Dog may not like each other in the beginning of the story and prefer to be alone, but all pets need love. Talk about how to care for pets and how we can show our pets we love them. For exampleTalk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:\n" +
                "\n" +
                "“Dogs have soft fur and tails, so do cats! Do cats like to chase their tails?”\n" +
                "\n" +
                "“Cats have short pointy ears, how do dog’s ears look?”\n" +
                "\n" +
                "Cat and Dog may not like each other in the beginning of the story and prefer to be alone, but all pets need love. Talk about how to care for pets and how we can show our pets we love them. For example");
        postPage.clickOnSubmitButton();
    }
    @Test
    public void randomImageIsDisplayed() {
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.followPost();
        postPage.postImageIsDisplayed();

    }

    //should fail
    @Test
    public void invalidPostTitleMoreThan40(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnCreateButton();
        sleep(3000);
        postPage.enterTitlePost("Talk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common");
        sleep(3000);
        postPage.clickOnSubmitButton();
        postPage.titleErrorMessage("Please fill the field");
    }

    @Test
    public void CreatePostOnlyWithTitle (){

        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnCreateButton();
        postPage.enterTitlePost("Cats&Dogs");
        postPage.clickOnSubmitButton();


    }

    @Test
    public void emptyPostTitle(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnCreateButton();
        sleep(3000);
        postPage.enterTitlePost("");
        sleep(3000);
        postPage.clickOnSubmitButton();
        sleep(3000);
        postPage.errorMessagesTextsCheck(Arrays.asList("Please fill the field","Please fill the field", "Please fill the field", "Please fill all fields"));
    }

    @Test
    public void savePostAsDraftCheck() {
        sleep(3000);
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnCreateButton();
        sleep(3000);
        postPage.enterTitlePost("Good vibes");
        postPage.enterDescriptionPost("Summer is upon us! It’s time to beat!");
        postPage.enterContentPost("My thoughts, no more than 1000 symbols");
        sleep(3000);
        postPage.clickOnDraftboxButton();
        sleep(3000);
        postPage.clickOnSubmitButton();
        sleep(3000);
        postPage.clickOnMyDrafts();
        sleep(3000);
        draftsPage.draftPostTitleCheck("Good vibes");
    }

    @Test
    public void viewMyPostsCheck() {
        sleep(3000);
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnMyPostsTumbler();
        sleep(3000);
        postPage.postsAuthorsCheck("johnsmith");//check that the post author is the same as username

    }

    @Test
    public void postPreviewCheck(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        sleep(3000);
        postPage.clickOnMyPostsTumbler();
        sleep(3000);
        postPage.postsTitlesAreDisplayedCheck();
        postPage.postsDescriptionsAreDisplayedCheck();
        postPage.postsPhotosAreDisplayedCheck();
    }
    @Test
    public void viewPostsWithoutAuthCheck(){
        open("http://chatty.telran-edu.de:8089/homeblog");
        loginPage.loginHeaderCheck("Login Form");//redirects to auth page
    }

    @Test
    public void withInvalidImageFormat(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnCreateButton();
        postPage.enterTitlePost("Dogs&Cats");
        postPage.enterDescriptionPost("Summer is upon us! like this month’s book selection, A Cat and a Dog, written by Claire Masurel;");
        postPage.enterContentPost("Talk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:");
        postPage.uploadedImagePost();
        postPage.checkIncorrectFormat("No file selected");
    }

    @Test
    public void checkOtherUsersPosts(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        headerPage.followHomeLink();
        postPage.clickOnMyPostsTumbler();

    }

    @Test
    public void checkButtonMyPosts(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnMyPostsTumbler();
        postPage.checkMyPostsButton("My Posts");
    }




}
