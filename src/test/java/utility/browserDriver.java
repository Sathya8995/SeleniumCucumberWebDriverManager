package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class browserDriver {
    public static ThreadLocal <WebDriver> tdriver = new ThreadLocal<>();
    public static WebDriver driver;
    public static void setDriver(WebDriver driver){
        tdriver.set(driver);
    }
    public static WebDriver getDriver(){
        return tdriver.get();
    }

}
