package otto.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java8.En;
import org.openqa.selenium.By;
import otto.pages.DamenmodePage;
import otto.pages.LoginPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class DamenmodePageSteps implements En {

    DamenmodePage damenmodePage;

    public DamenmodePageSteps(){

        When ("we are in Damenmode page", () ->{
            damenmodePage= page(DamenmodePage.class);
           $(byText("Damenmode")).should(exist);

//           if($("/html/body/section/div/div/div[2]/button").isDisplayed()){
//              damenmodePage.acceptCookiesSecond();
//           }
            if(damenmodePage.verifyOkCookieBtn().isDisplayed()){
              damenmodePage.acceptCookiesSecond();
            }
       });

        Then("in Damenmode page click on product", () ->{
            damenmodePage.choseAProduct();
        });
    }
}









