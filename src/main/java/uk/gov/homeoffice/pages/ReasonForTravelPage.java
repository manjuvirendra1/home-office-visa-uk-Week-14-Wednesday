package uk.gov.homeoffice.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.gov.homeoffice.customlisteners.CustomListeners;
import uk.gov.homeoffice.utilities.Utility;

public class ReasonForTravelPage extends Utility {

    public ReasonForTravelPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement clickOnTourismVisa;

    @CacheLookup
    @FindBy(css="#response-4")
    WebElement clickOnJoinPartnerVisa;

    @CacheLookup
    @FindBy(css="#response-1")
    WebElement clickOnWorkVisa;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnNextButton;

    public void selectReasonForVisit(String reason){
        Reporter.log("click on Tourism visa" + clickOnTourismVisa );
        clickOnElement1(clickOnTourismVisa);
        CustomListeners.test.log(Status.PASS,"click on Tourism visa");

    }

    public void selectReasonForVisit1(String reason){
        Reporter.log("click on Join partner visa" + clickOnJoinPartnerVisa );
        clickOnElement1(clickOnJoinPartnerVisa);
        CustomListeners.test.log(Status.PASS,"click on Join partner visa");

    }
    public void selectReasonForVisit2(String reason){
        Reporter.log("click on work visa" + clickOnWorkVisa );
        clickOnElement1(clickOnWorkVisa);
        CustomListeners.test.log(Status.PASS,"click on work visa");

    }

    public void clickNextStepButton(){
        Reporter.log("Click on continue button"+clickOnNextButton);
        clickOnElement1(clickOnNextButton);
        CustomListeners.test.log(Status.PASS,"Click on continue button"+clickOnNextButton);
    }
}
