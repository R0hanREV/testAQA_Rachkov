import lesson_8.SeleniumDriver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaySectionTest extends BaseTest {

    private WebDriver driver = SeleniumDriver.getInstance();

    @BeforeEach
    public void homePage() {
        driver.get("https://www.mts.by/");
        List<WebElement> cookieButtons = driver.findElements(By.xpath("//div[@class='cookie__wrapper']//button[text()='Отклонить']"));
        if (!cookieButtons.isEmpty() && cookieButtons.get(0).isDisplayed()) {
            cookieButtons.get(0).click();
        }
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
    @DisplayName("Проверка логотипов")
    @ValueSource(strings = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"})
    public void checkLogoPartners(String partner) {
        List<WebElement> logo = driver.findElements(By.xpath("//section[@class='pay']//div[@class='pay__partners']/ul/li/img"));
        String actualLogo = null;
        for (WebElement o : logo) {
            String alt = o.getAttribute("alt");
            if (alt.equals(partner)) {
                actualLogo = alt;
                break;
            }
        }
        Assertions.assertEquals(partner, actualLogo);
    }

    @Test
    public void checkButtonContinue() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement phone = driver.findElement(By.id("connection-phone"));
        WebElement payment = driver.findElement(By.id("connection-sum"));
        WebElement mail = driver.findElement(By.id("connection-email"));
        WebElement buttonContinue = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));

        phone.sendKeys("297777777");
        payment.sendKeys("100");
        mail.sendKeys("qwerty@mail.ru");
        buttonContinue.click();
        WebElement modelWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='payment-widget-iframe']")));
        Assertions.assertTrue(modelWindow.isDisplayed());
    }
}