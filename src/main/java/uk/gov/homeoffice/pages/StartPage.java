package uk.gov.homeoffice.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.gov.homeoffice.customlisteners.CustomListeners;
import uk.gov.homeoffice.utilities.Utility;

public class StartPage extends Utility {

    public StartPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNow;


    public void clickStartNow() {
        Reporter.log("click on start now " + startNow);
        mouseHoverToElementAndClick2(startNow);
        CustomListeners.test.log(Status.PASS,"mouseHover To Element And Click");
    }
}
