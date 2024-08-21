import org.junit.jupiter.api.Test;

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
}
