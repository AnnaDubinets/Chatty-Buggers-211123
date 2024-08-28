import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class ProfileTest extends BaseTest {
    @Test
    public void viewProfileTest() {
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        sleep(3000);
        postPage.clickOnUsersHeader();
        postPage.clickOnMyProfile();
        profilePage.usernameOnProfileCheck("johnsmith@gmail.com");//check that users email on profile is displayed

    }
    @Test
    public void editUsersProfileTest(){
        loginPage.enterEmail("johnsmith@gmail.com");
        loginPage.enterPassword("qwerty07");
        loginPage.followLoginButton();
        sleep(3000);
        postPage.clickOnUsersHeader();
        postPage.clickOnMyProfile();
        sleep(3000);
        profilePage.editProfileCheck();
        sleep(3000);
        profilePage.nameInputIsEnabled();//only when editing the profile, the inputs are enabled
    }

}
