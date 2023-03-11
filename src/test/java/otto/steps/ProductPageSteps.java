package otto.steps;

import io.cucumber.java8.En;
import otto.pages.ProductPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class ProductPageSteps implements En {

    ProductPage productPage;

    public ProductPageSteps() {

        When("we are in Product page", () -> {
            productPage = page(ProductPage.class);
            $(byText("Größe")).should(exist);
        });

        Then("add product in den Warenkorb",() ->{
            productPage.addToBasket();
        });

        Then("we see Model dialog and press Zum Warenkorb button", () ->{
            productPage.goToBasket();
        });
    }
}
