package otto.steps;

import io.cucumber.java8.En;
import otto.pages.BasketPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BasketPageSteps implements En {

    BasketPage basketPage;

    public BasketPageSteps(){
        When("we are in Basket",() ->{
            $(byText("Gesamtsumme")).should(exist);
        });

        Then ("we see chosen Product", () ->{
            $(byText("Vivance Maxikleid mit Blümchendruck ")).should(exist);
        });

        When("we delete product from Warenkorb", () ->{
            basketPage.deleteProduct();
        });

        And("click on Weiter einkaufen button", () ->{
            basketPage.clickOnBackToStore();
        });


    }
}
