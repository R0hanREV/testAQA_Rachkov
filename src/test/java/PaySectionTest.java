import lesson_8.SeleniumDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaySectionTest extends BaseTest {

    private WebDriver driver = SeleniumDriver.getInstance();

    @BeforeEach
    public void homePage() {
        driver.get("https://www.mts.by/");
      //  driver.findElement(By.id("cookie-agree")).click();
    }

    public void coockie() {
        driver.findElement(By.id("cookie-agree")).click();
    }

    @Test
    @DisplayName("Проверка названия секции платежи")
    public void checkSectionTitle() {
        WebElement title = driver.findElement(By.xpath("//section[@class='pay']//h2"));
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", title.getText());
    }

    @Test
    @DisplayName("Проверка работы ссылки \"О сервисе\"")
    public void checkLinkService() throws InterruptedException {
        WebElement link = driver.findElement(By.xpath("//section[@class='pay']//a"));
        Assertions.assertTrue(link.isDisplayed());
        Assertions.assertTrue(link.isEnabled());
        link.click();
        Thread.sleep(5000);
        String nextLink = driver.getCurrentUrl();
        Assertions.assertEquals(nextLink, "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"})
    public void checkLogoPartners(String partner) {
        List<WebElement> logo = driver.findElements(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='" + partner + "']"));
        for (WebElement o : logo) {
            String actualLogo = o.getAttribute("alt");
            Assertions.assertEquals(partner, actualLogo);
        }
    }


    @ParameterizedTest
    @DisplayName("Проверка логотипа Visa")
    @ValueSource(strings = {"Visa"})
    public void checkLogoVisa(String partner) {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='" + partner + "']"));
        Assertions.assertEquals(partner, logo.getAttribute("alt"));
    }

    @ParameterizedTest
    @DisplayName("Проверка логотипа Verified By Visa")
    @ValueSource(strings = {"Verified By Visa"})
    public void checkLogoVisaVerify(String partner) {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='" + partner + "']"));
        Assertions.assertEquals(partner, logo.getAttribute("alt"));
    }

    @ParameterizedTest
    @DisplayName("Проверка логотипа MasterCard")
    @ValueSource(strings = {"MasterCard"})
    public void checkLogoMasterCard(String partner) {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='" + partner + "']"));
        Assertions.assertEquals(partner, logo.getAttribute("alt"));
    }

    @ParameterizedTest
    @DisplayName("Проверка логотипа MasterCard Secure Code")
    @ValueSource(strings = {"MasterCard Secure Code"})
    public void checkLogoMasterCardSecure(String partner) {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='" + partner + "']"));
        Assertions.assertEquals(partner, logo.getAttribute("alt"));
    }

    @ParameterizedTest
    @DisplayName("Проверка логотипа Белкарт")
    @ValueSource(strings = {"Белкарт"})
    public void checkLogoBelcard(String partner) {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img[@alt='" + partner + "']"));
        Assertions.assertEquals(partner, logo.getAttribute("alt"));
    }

    @Test
    public void checkButtonContinue() throws InterruptedException {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        WebElement payment = driver.findElement(By.id("connection-sum"));
        WebElement mail = driver.findElement(By.id("connection-email"));
        WebElement buttonContinue = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));

        phone.sendKeys("297777777");
        payment.sendKeys("100");
        mail.sendKeys("qwerty@mail.ru");
        buttonContinue.click();
        Thread.sleep(10000);
        WebElement modelWindow = driver.findElement(By.xpath("//iframe[@class='payment-widget-iframe']"));
        Assertions.assertTrue(modelWindow.isDisplayed());
    }
}