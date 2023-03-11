package otto.steps;

import io.cucumber.java8.En;
import otto.pages.DamenmodePage;
import otto.pages.LoginPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class DamenmodePageSteps implements En {

    DamenmodePage damenmodePage;

    public DamenmodePageSteps(){

        When ("we are in Damenmode page", () ->{
            damenmodePage= page(DamenmodePage.class);
           $(byText("Damenmode")).should(exist);
       });

        Then("in Damenmode page click on product", () ->{

            damenmodePage.choseAProduct();
        });
    }
}









