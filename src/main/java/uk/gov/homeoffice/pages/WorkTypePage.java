package uk.gov.homeoffice.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.gov.homeoffice.customlisteners.CustomListeners;
import uk.gov.homeoffice.utilities.Utility;

public class WorkTypePage extends Utility {

    public WorkTypePage(){
        PageFactory.initElements(driver,this);

    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement workType;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickOnNextButton1;

    public void selectJobType(){
        Reporter.log("click on work type" + workType );
        clickOnElement1(workType);
        CustomListeners.test.log(Status.PASS,"click on work type");

    }
    public void clickNextStepButton(){
        Reporter.log("click on start now " + clickOnNextButton1);
        mouseHoverToElementAndClick1(clickOnNextButton1);
        CustomListeners.test.log(Status.PASS,"mouseHover To Element And Click");
    }
}
