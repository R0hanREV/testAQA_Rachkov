import lesson_10.page.PaySectionPage;
import lesson_10.steps.FramePaymentPageSteps;
import lesson_10.steps.PaySectionPageSteps;
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
    private PaySectionPageSteps paySectionPageSteps;
    private FramePaymentPageSteps framePaymentPageSteps;

    @BeforeEach
    public void homePage() {
        driver.get("https://www.mts.by/");
        List<WebElement> cookieButtons = driver.findElements(By.xpath("//div[@class='cookie__wrapper']//button[text()='Отклонить']"));
        if (!cookieButtons.isEmpty() && cookieButtons.get(0).isDisplayed()) {
            cookieButtons.get(0).click();
        }
        paySectionPageSteps = new PaySectionPageSteps();
        framePaymentPageSteps = new FramePaymentPageSteps();
    }

    @Test
    @DisplayName("Проверка названия секции платежи")
    public void checkSectionTitle() {
        Assertions.assertEquals("Онлайн пополнение\nбез комиссии", paySectionPageSteps.getSectionTitle());
    }

    @Test
    @DisplayName("Проверка работы ссылки \"О сервисе\"")
    public void checkNewPageLinkService() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        paySectionPageSteps.clickLinkService();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("breadcrumbs")));
        String link = driver.getCurrentUrl();
        Assertions.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", link);
    }

    @ParameterizedTest
    @DisplayName("Проверка логотипов")
    @ValueSource(strings = {"Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт"})
    public void checkLogoPartners(String partner) {
        Assertions.assertEquals(partner, paySectionPageSteps.checkLogo(partner));
    }

    @Test
    public void checkButtonContinue() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        paySectionPageSteps.fillPhoneField("297777777");
        paySectionPageSteps.fillPaymentField("100");
        paySectionPageSteps.fillMailField("qwerty@mail.ru");
        paySectionPageSteps.clickButtonContinue();
    //    Thread.sleep(10000);
        //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-root")));
      //  Assertions.assertTrue(framePaymentPageSteps.getIframe().isDisplayed());
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='payment-widget-iframe']")));
        Assertions.assertEquals("100.00 BYN",framePaymentPageSteps.getHeaderSum());
        Assertions.assertEquals("Номер карты",framePaymentPageSteps.getCardNumberField());
        Assertions.assertEquals("Срок действия",framePaymentPageSteps.getCardDurationField());
        Assertions.assertEquals("CVC",framePaymentPageSteps.getCardCvcCode());
        Assertions.assertEquals("Имя и фамилия на карте",framePaymentPageSteps.getCardNameField());
        Assertions.assertEquals("Оплата: Услуги связи Номер:375297777777",framePaymentPageSteps.getHeaderPhonNumber());
        Assertions.assertEquals("Оплатить 100.00 BYN",framePaymentPageSteps.getButtonSum());
    }

    @Test
    public void checkPlaceholders() {
        Assertions.assertEquals("Номер телефона", paySectionPageSteps.placeholderPhoneField());
        Assertions.assertEquals("Сумма", paySectionPageSteps.placholderPaymentField());
        Assertions.assertEquals("E-mail для отправки чека", paySectionPageSteps.placeholderMailField());
        Assertions.assertEquals("Номер абонента", paySectionPageSteps.placeholderInternetPhoneField());
        Assertions.assertEquals("Сумма", paySectionPageSteps.placeholderInternetPaymentField());
        Assertions.assertEquals("E-mail для отправки чека", paySectionPageSteps.placeholderInternetMailField());
        Assertions.assertEquals("Номер счета на 44", paySectionPageSteps.placeholderInstalmentScoreField());
        Assertions.assertEquals("Сумма", paySectionPageSteps.placeholderInstalmentPaymentField());
        Assertions.assertEquals("E-mail для отправки чека", paySectionPageSteps.placeholderInstalmentMailField());
        Assertions.assertEquals("Номер счета на 2073", paySectionPageSteps.placeholderArrearsScoreField());
        Assertions.assertEquals("Сумма", paySectionPageSteps.placeholderArrearsSumField());
        Assertions.assertEquals("E-mail для отправки чека", paySectionPageSteps.placeholderArrearsMAilField());
    }
}