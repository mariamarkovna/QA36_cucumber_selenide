package otto.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java8.En;
import otto.pages.BasketPage;
import otto.pages.DamenmodePage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BasketPageSteps implements En {

    BasketPage basketPage;


    public BasketPageSteps(){
        When("we are in Basket",() ->{
            basketPage= page(BasketPage.class);
            $(byText("Gesamtsumme")).should(exist);
        });

        Then ("we see chosen Product", () ->{
           $(byText("Vivance Maxikleid mit Blümchendruck")).should(exist);

            //basketPage.verifyChosenProduct().shouldBe(Condition.visible);

        });

        When("we delete product from Warenkorb", () ->{
            basketPage.deleteProduct();
        });

        And("check that the cart is empty", () ->{
            $(byText("Es befinden sich keine Artikel in deinem Warenkorb.")).should(exist);
        });

        When("Click on Weiter einkaufen button", () ->{
            basketPage.clickOnBackToStore();
        });


    }
}
