package stepDefinition;

import io.cucumber.java.en.*;

import static pages.HomePage.*;
import static pages.LoginPage.*;

public class HomePage {

    @Given("User navigates to the login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        openUrl();
        click_hamburger_menu();
        click_Signin_Link();

    }

}
