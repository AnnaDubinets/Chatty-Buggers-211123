import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {

    private SelenideElement homeLink = $("a[href='/homeblog']");

    public void followHomeLink(){
        homeLink.click();
    }
}
