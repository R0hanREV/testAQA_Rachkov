package lesson_10.page;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class PaySectionPage {

    @FindBy(xpath = "//section[@class='pay']//h2")
    private WebElement sectionTitle;

    @FindBy(xpath = "//section[@class='pay']//a")
    private WebElement linkService;

    @FindBy(xpath = "//section[@class='pay']//div[@class='pay__partners']/ul/li/img")
    private List<WebElement> logoPartners;

    @FindBy(xpath = "//form[@class='pay-form opened']//button")
    private WebElement buttonContinue;

    @FindBy(id = "connection-phone")
    private WebElement phoneField;

    @FindBy(id = "connection-sum")
    private WebElement paymentField;

    @FindBy(id = "connection-email")
    private WebElement mailField;

    @FindBy(id = "internet-phone")
    private WebElement internetPhoneField;

    @FindBy(id = "internet-sum")
    private WebElement internetPaymentField;

    @FindBy(id = "internet-email")
    private WebElement internetMailField;

    @FindBy(id = "score-instalment")
    private WebElement instalmentScore;

    @FindBy(id = "instalment-sum")
    private WebElement instalmentSum;

    @FindBy(id = "instalment-email")
    private WebElement instalmentMail;

    @FindBy(id = "score-arrears")
    private WebElement arrearsScore;

    @FindBy(id = "arrears-sum")
    private WebElement arrearsSum;

    @FindBy(id = "arrears-email")
    private WebElement arrearsMail;


    public WebElement getSectionTitle() {
        return sectionTitle;
    }

    public WebElement getLinkService() {
        return linkService;
    }

    public List<WebElement> getLogoPartners() {
        return logoPartners;
    }

    public WebElement getButtonContinue() {
        return buttonContinue;
    }

    public WebElement getPhoneField() {
        return phoneField;
    }

    public WebElement getPaymentField() {
        return paymentField;
    }

    public WebElement getMailField() {
        return mailField;
    }

    public WebElement getInternetPhoneField() {
        return internetPhoneField;
    }

    public WebElement getInternetPaymentField() {
        return internetPaymentField;
    }

    public WebElement getInternetMailField() {
        return internetMailField;
    }

    public WebElement getInstalmentScore() {
        return instalmentScore;
    }

    public WebElement getInstalmentSum() {
        return instalmentSum;
    }

    public WebElement getInstalmentMail() {
        return instalmentMail;
    }

    public WebElement getArrearsScore() {
        return arrearsScore;
    }

    public WebElement getArrearsSum() {
        return arrearsSum;
    }

    public WebElement getArrearsMail() {
        return arrearsMail;
    }
}
