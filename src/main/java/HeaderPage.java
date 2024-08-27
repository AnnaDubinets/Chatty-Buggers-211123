import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPage {

    private SelenideElement homeLink = $("a[href='/homeblog']");

    private SelenideElement contactLink = $("a[href='/contact']");

    public void followHomeLink(){
        homeLink.click();
    }

    public void followContactLink(){
        contactLink.click();
    }



}
