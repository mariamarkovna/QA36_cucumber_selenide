package otto.pages;

import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideWait;
import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage  {

    private static By formHeader = By.cssSelector("[data-qa='user_login_form_headline']");
    private static By emailInput= By.cssSelector("[data-qa='user_login_email']");
    private static By passwordInput= By.cssSelector("[data-qa='user_login_password']");
    private static By buttonSubmit= By.cssSelector("[data-qa='user_dialog_submit_button']");

    private static String userName= "i-mar81@mail.ru";
    private static String password= "Moht1t8o";



    public SelenideElement formIsShown() {

        return $(formHeader);
    }


    public void validAuth() {

        $(emailInput).val(userName);
        $(passwordInput).val(password);
    }

    public void submit() {
        $(buttonSubmit).click();
    }
}
