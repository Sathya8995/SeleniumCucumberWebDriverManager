package stepDefinition;

import io.cucumber.java.en.*;

import static pages.OnlineProductsPage.*;

public class OnlineProductsPage {
    @Then("user should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        verifyFormalshoe();
        verifySportshoe();
        verifySneakers();
    }
}
