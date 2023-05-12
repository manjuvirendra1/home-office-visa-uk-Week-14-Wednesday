package uk.gov.homeoffice.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.gov.homeoffice.customlisteners.CustomListeners;
import uk.gov.homeoffice.utilities.Utility;

public class DurationOfStayPage extends Utility {

    @CacheLookup
    @FindBy(id="response-0")
    WebElement clickOnLongerThanSixMonth;

    @CacheLookup
    @FindBy(id="response-1")
    WebElement clickOnLessThanSixMonth;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnContinueButton;

    public void selectLengthOfStay(String moreOrLess){
        clickOnElement1(clickOnLessThanSixMonth);
    }
    /*
            switch (moreOrLess){
                case "clickOnLessThanSixMonth":
                    System.out.println("6 months or less");
                    break;
                case "clickOnLongerThanSixMonth":
                    System.out.println("longer than 6 months");
                    break;
                default:
                    System.out.println("Error message");
            }
        }*/
    public void clickOnNextStepButton(){
        Reporter.log("click on start now " + clickOnContinueButton);
        mouseHoverToElementAndClick1(clickOnContinueButton);
        CustomListeners.test.log(Status.PASS,"mouseHover To Element And Click");
    }
}
