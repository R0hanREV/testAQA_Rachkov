package lesson_10.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePaymentPage {

    @FindBy(xpath = "//span[@class='ng-star-inserted']")
    private WebElement headerSum;

    @FindBy(xpath = "//button[@type='submit']/span[@_ngcontent-ng-c2514714136]")
    private WebElement buttonSum;

    @FindBy(xpath = "//div[@class='pay-description__text']/span[@_ngcontent-ng-c3700686460]")
    private WebElement headerPhonNumber;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-2']//label[@class='ng-tns-c2312288139-2 ng-star-inserted']")
    private WebElement cardNumberField;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-4']//label[@class='ng-tns-c2312288139-4 ng-star-inserted']")
    private WebElement cardDurationField;

    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-5']//label[@class='ng-tns-c2312288139-5 ng-star-inserted']")
    private WebElement cardCvcCode;

    @FindBy(xpath = "//label[@class='ng-tns-c2312288139-3 ng-star-inserted']")
    private WebElement cardNameField;

    @FindBy(xpath = "//div[@class='cards-brands cards-brands__container ng-tns-c2797898136-1 ng-trigger ng-trigger-brandsState ng-star-inserted']//img")
    private List<WebElement> cardLogos;

    @FindBy(xpath = "//iframe[@class='payment-widget-iframe']")
    private WebElement iFrameWindow;

    @FindBy(xpath = "//div[@class='cards-brands ng-tns-c2312288139-2']//img[@src='assets/images/payment-icons/card-types/visa-system.svg']")
    private WebElement logoVisa;

    @FindBy(xpath = "//div[@class='cards-brands ng-tns-c2312288139-2']//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']")
    private WebElement logoMasterCard;

    @FindBy(xpath = "//div[@class='cards-brands ng-tns-c2312288139-2']//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']")
    private WebElement logoBelkart;

    @FindBy(xpath = "//div[@class='cards-brands ng-tns-c2312288139-2']//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']")
    private WebElement logoMaestro;

    @FindBy(xpath = "//div[@class='cards-brands ng-tns-c2312288139-2']//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']")
    private WebElement logoMir;

    public WebElement getHeaderSum() {
        return headerSum;
    }

    public WebElement getButtonSum() {
        return buttonSum;
    }

    public WebElement getHeaderPhonNumber() {
        return headerPhonNumber;
    }

    public WebElement getCardNumberField() {
        return cardNumberField;
    }

    public WebElement getCardDurationField() {
        return cardDurationField;
    }

    public WebElement getCardCvcCode() {
        return cardCvcCode;
    }

    public WebElement getCardNameField() {
        return cardNameField;
    }

    public WebElement getLogoVisa() {
        return logoVisa;
    }

    public WebElement getLogoMasterCard() {
        return logoMasterCard;
    }

    public WebElement getLogoBelkart() {
        return logoBelkart;
    }

    public WebElement getLogoMaestro() {
        return logoMaestro;
    }

    public WebElement getLogoMir() {
        return logoMir;
    }
}
