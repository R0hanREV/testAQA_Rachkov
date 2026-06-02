import lesson_8.SeleniumDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaySectionTest extends BaseTest {

    private WebDriver driver = SeleniumDriver.getInstance();

    @BeforeEach
    public void homePage() {
        driver.get("https://www.mts.by/");

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
        List<WebElement> logo = driver.findElements(By.xpath("//section[@class='pay']//div[@class='pay__partners']//img"));
        for (WebElement o : logo) {
            String actualLogo = o.getAttribute("alt");
            Assertions.assertEquals(actualLogo, partner);
        }
    }


    @Test
    @DisplayName("Проверка логотипа Visa")
    public void checkLogoVisa() {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//li[1]/img"));
        Assertions.assertEquals(logo.getAttribute("alt"), "Visa");
    }

    @Test
    @DisplayName("Проверка логотипа Verified By Visa")
    public void checkLogoVisaVerify() {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//li[2]/img"));
        Assertions.assertEquals(logo.getAttribute("alt"), "Verified By Visa");
    }

    @Test
    @DisplayName("Проверка логотипа MasterCard")
    public void checkLogoMasterCard() {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//li[3]/img"));
        Assertions.assertEquals(logo.getAttribute("alt"), "MasterCard");
    }

    @Test
    @DisplayName("Проверка логотипа MasterCard Secure Code")
    public void checkLogoMasterCardSecure() {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//li[4]/img"));
        Assertions.assertEquals(logo.getAttribute("alt"), "MasterCard Secure Code");
    }

    @Test
    @DisplayName("Проверка логотипа Белкарт")
    public void checkLogoBelcard() {
        WebElement logo = driver.findElement(By.xpath("//section[@class='pay']//div[@class='pay__partners']//li[5]/img"));
        Assertions.assertEquals(logo.getAttribute("alt"), "Белкарт");
    }

    public void checkButtonContinue() {
        WebElement phone = driver.findElement(By.id("connection-phone"));
        WebElement payment = driver.findElement(By.id("connection-sum"));
        WebElement mail = driver.findElement(By.id("connection-email"));
        WebElement buttonContinue = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        WebElement modelWindow = driver.findElement();

        phone.sendKeys("297777777");
        payment.sendKeys("100");
        mail.sendKeys("qwerty@mail.ru");
        buttonContinue.click();
        Thread.sleep(5000);

    }
}