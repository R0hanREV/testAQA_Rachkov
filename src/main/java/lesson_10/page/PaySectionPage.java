package lesson_10.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PaySectionPage {

    @FindBy(xpath = "//section[@class='pay']//h2")
    private WebElement sectionTitle;

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


  //  WebElement phone = driver.findElement(By.id("connection-phone"));
  //  WebElement payment = driver.findElement(By.id("connection-sum"));
  //  WebElement mail = driver.findElement(By.id("connection-email"));
}
