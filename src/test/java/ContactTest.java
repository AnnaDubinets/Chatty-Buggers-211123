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
        contactPage.messageEmail("Talk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:\n" +
                "“Dogs have soft fur and tails, so do cats! Do cats like to chase their tails?”\n" +
                "“Cats have short pointy ears, how do dog’s ears look?”\n" +
                "Cat and Dog may not like each other in the beginning of the story and prefer to be alone, but all pets need love. Talk about how to care for pets and how we can show our pets we love them. For example:");
        contactPage.clickSendMessage();
        contactPage.successSendMessage("Feedback submitted successfully!");
    }

    @Test
    public void contactWithInvalidContentTestMore1000(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        sleep(3000);
        headerPage.followContactLink();
        sleep(3000);
        contactPage.enterName("John");
        contactPage.enterEmail("johnsmith@gmail.com");
        contactPage.messageEmail("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam q");
        sleep(3000);
        contactPage.clickSendMessage();
        sleep(3000);
        contactPage.successMessageIsNotDisplayed();//the message is not sent and there is no success message

    }

    @Test
    public void contactWithInvalidContentLessThan3Symbols(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        sleep(3000);
        headerPage.followContactLink();
        contactPage.enterName("John");
        contactPage.enterEmail("johnsmith@gmail.com");
        contactPage.messageEmail("Yo");
        sleep(3000);
        contactPage.clickSendMessage();
        sleep(3000);
        contactPage.successMessageIsNotDisplayed();//is displayed, the message with content less than 3 is sent,it is a bug!

    }


    @Test
    public void withInvalidName(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        headerPage.followContactLink();
        contactPage.enterName("John12345678901234569999999999999999999");
        contactPage.enterEmail("johnsmith@gmail.com");
        contactPage.messageEmail("Talk about cats and dogs! Before reading the story, Ask your child, “What do you see on the cover?”Have a conversation with your child about how cats and dogs are different and what traits they have in common. For example:\n" +
                "“Dogs have soft fur and tails, so do cats! Do cats like to chase their tails?”\n" +
                "“Cats have short pointy ears, how do dog’s ears look?”\n" +
                "Cat and Dog may not like each other in the beginning of the story and prefer to be alone, but all pets need love. Talk about how to care for pets and how we can show our pets we love them. For example:");
        contactPage.clickSendMessage();
    }

    @Test
    public void withEmptyFields(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        headerPage.followContactLink();
        contactPage.enterName(" ");
        contactPage.enterEmail(" ");
        contactPage.messageEmail(" ");
        contactPage.clickSendMessage();
    }
}
