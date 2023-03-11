package otto.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DamenmodePage {

private static By productBtn= By.cssSelector(".reco_cinema_csr__9952160342632405 > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)");

public void choseAProduct() {
    $(productBtn).click();
}

}



