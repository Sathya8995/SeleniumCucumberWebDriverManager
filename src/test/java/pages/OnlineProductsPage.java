package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.browserDriver;

public class OnlineProductsPage extends browserDriver {
    public static String formalShoe = "//div[@id=\"SmokeTests\"]/center/h3";
    public static String sportShoe = "//div[@id=\"RegressionTests\"]/center/h3";
    public static String sneakers = "//div[@id=\"VanguardTests\"]/center/h3";

    public static void verifyFormalshoe() throws InterruptedException {
        Assert.assertEquals("Formal Shoes", getDriver().findElement(By.xpath(formalShoe)).getText());
    }

    public static void verifySportshoe()throws InterruptedException {
        Assert.assertEquals("Sports", getDriver().findElement(By.xpath(sportShoe)).getText());
    }

    public static void verifySneakers() throws InterruptedException {
        Assert.assertEquals("Sneakers", getDriver().findElement(By.xpath(sneakers)).getText());
    }


}
