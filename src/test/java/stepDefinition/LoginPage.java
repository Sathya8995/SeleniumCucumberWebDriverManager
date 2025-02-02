package stepDefinition;

import io.cucumber.java.en.*;

import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        userName_textbox();
        passWord_textbox();
        clickLogin();
    }

    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        clickRegister();
    }
}
