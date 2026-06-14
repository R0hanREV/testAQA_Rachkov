package lesson_10.steps;

import lesson_10.page.FramePaymentPage;
import lesson_10.page.PaySectionPage;
import lesson_8.SeleniumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FramePaymentPageSteps {
    private final FramePaymentPage framePaymentPage;


    public FramePaymentPageSteps() {
        this.framePaymentPage = PageFactory.initElements(SeleniumDriver.getInstance(), FramePaymentPage.class);
    }

    public String getHeaderSum() {
        return framePaymentPage.getHeaderSum().getText();
    }

    public String getButtonSum() {
        return framePaymentPage.getButtonSum().getText();
    }

    public String getHeaderPhonNumber() {
        return framePaymentPage.getHeaderPhonNumber().getText();
    }

    public String getCardNumberField() {
        return framePaymentPage.getCardNumberField().getText();
    }

    public String getCardDurationField() {
        return framePaymentPage.getCardDurationField().getText();
    }

    public String getCardCvcCode() {
        return framePaymentPage.getCardCvcCode().getText();
    }

    public String getCardNameField() {
        return framePaymentPage.getCardNameField().getText();
    }

    public WebElement getIframe(){
        return framePaymentPage.getiFrameWindow();
    }
}
