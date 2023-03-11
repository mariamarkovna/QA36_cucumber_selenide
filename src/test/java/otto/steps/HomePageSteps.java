package otto.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import otto.pages.HomePage;
import otto.pages.LoginPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomePageSteps implements En {
    HomePage homePage;
    LoginPage loginPage;
    WebDriver driver;
    String baseUrl = "https://www.otto.de/";

    public HomePageSteps() {
        Given("that we navigate to home page", () -> {
            driver = new FirefoxDriver();
            WebDriverRunner.setWebDriver(driver);
            homePage = open(baseUrl, HomePage.class);
        });

        When("we accept cookies", () -> {
            homePage.acceptCookies();
        });

        When("we press Mein Konto icon", () -> {
            homePage.goToMeinKonto();
        });

        Then("Home page is loaded", () -> {
            homePage.verifyAuthIcon().shouldBe(Condition.visible);
        });





        Given("we a logged in",() -> {
            driver = new FirefoxDriver();
            WebDriverRunner.setWebDriver(driver);
            homePage = open(baseUrl, HomePage.class);
            homePage.acceptCookies();
            homePage.goToMeinKonto();
            loginPage= page(LoginPage.class);
            loginPage.formIsShown().shouldHave(text("Deine Anmeldedaten"));
            loginPage.validAuth();
            loginPage.submit();
            homePage.verifyAuthIcon().shouldBe(Condition.visible);


        });

        Then("chose a category Damen", () ->{
            homePage.clickOnDamenBtn();
                });


//        Then("Home Page is loaded", () ->{
//            $(byText("Über uns")).should(exist);
//        });



    }
}
