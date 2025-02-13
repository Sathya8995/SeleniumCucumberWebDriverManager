package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utility.browserDriver;

public class RegistrationPage extends browserDriver {
    public static String user_registration_page = "/html/body/center/h1";
    public static String salutation = "//select[@id=\"Salutation\"]";

    public static void registraionPage() throws InterruptedException {
        Select dropdown = new Select(getDriver().findElement(By.xpath(salutation)));
        dropdown.selectByVisibleText("Ms.");
        Assert.assertEquals("User Registration Page", getDriver().findElement(By.xpath(user_registration_page)).getText());
    }
}
