import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class PostTest extends BaseTest{

    @Test
    public void successCreatePost(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        postPage.clickOnCreateButton();
        postPage.enterTitlePost("Cats&Dogs");
        postPage.enterDescriptionPost("Summer is upon us! like this month’s book selection, A Cat and a Dog, written by Claire Masurel;");
        postPage.enterContentPost("Talk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:");
        postPage.clickOnSubmitButton();

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
        sleep(5000);
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
}
