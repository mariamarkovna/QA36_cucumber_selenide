package otto.pages;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage implements En {

    private static By inDenWarencorbBtn = By.xpath("//button[@data-qa='addToBasket']");
    //private static By zurWarencorbBtn = By.cssSelector("[data-qa='goToBasket']");
    private static By zurWarencorbBtn = By.cssSelector(".or_itemAdded__buttonPane--basketBottom > div:nth-child(2) > a:nth-child(1) ");


    public void addToBasket() {
        $(inDenWarencorbBtn).click();
    }

    public void goToBasket() {
        $(zurWarencorbBtn).click();
    }
}
