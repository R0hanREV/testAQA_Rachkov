package lesson_10.steps;

import lesson_10.page.PaySectionPage;
import lesson_8.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaySectionPageSteps {
    private final PaySectionPage paySectionPayPage;

    public PaySectionPageSteps() {
        this.paySectionPayPage = PageFactory.initElements(SeleniumDriver.getInstance(), PaySectionPage.class);
    }

    public String getSectionTitle() {
        return paySectionPayPage.getSectionTitle().getText();
    }

   public void clickLinkService(){
     paySectionPayPage.getLinkService().click();
   }

    public List<WebElement> getLogoPartners() {
        return paySectionPayPage.getLogoPartners();
    }

    public void fillPhoneField(String phone) {
        paySectionPayPage.getPhoneField().sendKeys(phone);
    }

    public void fillPaymentField(String payment) {
        paySectionPayPage.getPaymentField().sendKeys(payment);
    }

    public void fillMailField(String mail) {
        paySectionPayPage.getMailField().sendKeys(mail);
    }

    public void clickButtonContinue(){
        paySectionPayPage.getButtonContinue().click();
    }

    public String checkLogo(String partner){
        List<WebElement> logo = paySectionPayPage.getLogoPartners();
        String actualLogo = null;
        for (WebElement o : logo) {
            String alt = o.getAttribute("alt");
            if (alt.equals(partner)) {
                actualLogo = alt;
                break;
            }
        }
        return actualLogo;
    }
}
