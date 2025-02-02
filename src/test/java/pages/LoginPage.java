package pages;
import org.openqa.selenium.By;
import utility.browserDriver;

public class LoginPage extends browserDriver {

    public static String username_textbox = "//input[@id=\"usr\"]";
    public static String password_textbox = "//input[@id=\"pwd\"]";
    public static String login_button = "//form[@id=\"second_form\"]/input";
    public static String register_button = "//button[@id=\"NewRegistration\"]";


    public static void userName_textbox() throws InterruptedException {
        driver.findElement(By.xpath(username_textbox)).sendKeys("sa");
        //Thread.sleep(1000);
    }

    public static void passWord_textbox() throws InterruptedException{
        driver.findElement(By.xpath(password_textbox)).sendKeys("sa");
        //Thread.sleep(1000);
    }

    public static void clickLogin () throws InterruptedException{
        driver.findElement(By.xpath(login_button)).click();
        Thread.sleep(1000);
    }

    public static void clickRegister () throws InterruptedException{
        driver.findElement(By.xpath(register_button)).click();
        Thread.sleep(1000);
    }
}
