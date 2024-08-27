import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class ContactTest extends BaseTest{

    @Test
    public void checkOptionContactUsWithValidDate(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        headerPage.followContactLink();
        contactPage.enterName("John");
        contactPage.enterEmail("johnsmith@gmail.com");
        contactPage.enterEmail("Talk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:\n" +
                "“Dogs have soft fur and tails, so do cats! Do cats like to chase their tails?”\n" +
                "“Cats have short pointy ears, how do dog’s ears look?”\n" +
                "Cat and Dog may not like each other in the beginning of the story and prefer to be alone, but all pets need love. Talk about how to care for pets and how we can show our pets we love them. For example:");
        contactPage.clickSendMessage();
        contactPage.successSendMessage("Feedback submitted successfully!");
    }
}
