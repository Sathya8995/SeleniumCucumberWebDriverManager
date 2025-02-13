package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.browserDriver;

public class HomePage extends browserDriver {
    public static String menu_xpath = "//div[@id=\"menuToggle\"]/input";

    public static String sign_in_portal_xpath = "//ul[@id=\"menu\"]/a[2]/li";


    public static void openUrl() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        setDriver(driver);
        //Thread.sleep(2000);
        getDriver().get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(1000);
    }

    public static void click_hamburger_menu() throws InterruptedException {

        getDriver().findElement(By.xpath(menu_xpath)).click();
        Thread.sleep(1000);
    }

    public static void click_Signin_Link() throws InterruptedException {
        getDriver().findElement(By.xpath(sign_in_portal_xpath)).click();
        Thread.sleep(1000);

    }

}
