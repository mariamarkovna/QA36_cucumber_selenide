package otto.pages;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {


    private static By okCookiesButton = By.cssSelector("#cookieBanner > div > div > div.cookieBanner__footer > button");
   //private  static By meinKontoIcon = By.cssSelector("[data-qa='user_login_area_header_container']");
   private static By meinKontoIcon = By.cssSelector("[data-qa='user_login_area_icon']");


    private  static By anmeldenButton = By.cssSelector("[data-qa='user_login_area_login']");


    private  static By loggedInIcon = By.cssSelector("[data-qa='user_login_area_badge_logged_in']");

    private  static By Damenbtn = By.cssSelector(".nav_navi-list--level-1 > li:nth-child(3) > a:nth-child(1)");


    public void acceptCookies() {

        $(okCookiesButton).click();
    }

    public void goToMeinKonto(){
        //$(meinKontoIcon).click();
        $(meinKontoIcon).click(ClickOptions.usingJavaScript());
        $(anmeldenButton).click();
    }



    public SelenideElement verifyAuthIcon() {
        return $(loggedInIcon);
    }

    public void clickOnDamenBtn(){
        $(Damenbtn).click();

    }

}
