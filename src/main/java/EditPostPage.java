import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class EditPostPage {
    private SelenideElement deletePostButton = $("[alt=\"delete button\"]");

    public void clickOnDeleteButton(){
        deletePostButton.click();

    }
}
