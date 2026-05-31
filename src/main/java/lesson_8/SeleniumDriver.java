package lesson_8;

import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Objects;

public class SeleniumDriver {

    private final static ThreadLocal<WebDriver> driver = new ThreadLocal<>();



    public static WebDriver getInstance(){

        return driver.get();
    }
}
