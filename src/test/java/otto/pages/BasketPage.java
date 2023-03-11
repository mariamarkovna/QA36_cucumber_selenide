package otto.pages;

import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage implements En {

    private static By deleteBtn= By.xpath("/html/body/div[1]/div/div[1]/div/div/section[2]/div[5]/div/div/div/div[4]/div/div[3]/form/button");

    private static By weiterEinkaufenBtn = By.xpath("/html/body/div[1]/div/div[1]/div/div/section[2]/div[5]/div/div[1]/a");

    public void deleteProduct(){
        $(deleteBtn).click();
    }

    public void clickOnBackToStore(){
        $(weiterEinkaufenBtn).click();

    }
}
