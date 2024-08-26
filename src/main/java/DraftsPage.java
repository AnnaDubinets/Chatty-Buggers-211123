import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class DraftsPage {
    private SelenideElement myDraftsButton = $("//*[@id=\"root\"]/div[2]/div[2]/div/div/div[2]/a[2]/span");

    private SelenideElement postTitleInDrafts = $("h3");

    public void clickOnMyDrafts(){
        myDraftsButton.click();
    }

    public void draftPostTitleCheck(String expectedText){
        postTitleInDrafts.shouldHave(text(expectedText));
    }
}
