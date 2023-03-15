package otto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DamenmodePage {

private static By productBtn= By.xpath("/html/body/div[2]/div[1]/main/div[1]/div[1]/div[2]/div[2]/div/div/ul/li[1]/a");
private static By cookiesOkBtn= By.xpath("/html/body/section/div/div/div[2]/button");

public SelenideElement verifyOkCookieBtn() {
    return $(cookiesOkBtn);
}

public void acceptCookiesSecond(){
    $(cookiesOkBtn).click();
}

public void choseAProduct() {

    $(productBtn).click();
}



}



