package uk.gov.homeoffice.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.gov.homeoffice.customlisteners.CustomListeners;
import uk.gov.homeoffice.utilities.Utility;

public class SelectNationalityPage extends Utility {

    public SelectNationalityPage(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(id = "response")//(xpath = "//select[@id='response']")//(css = "#response")
    WebElement countryNameField;
    public void selectNationality(String nationality){
        Reporter.log("Select from visible dropdown"+ countryNameField);
        selectByVisibleTextFromDropDown(countryNameField,"Australia");
        CustomListeners.test.log(Status.PASS,"Select from visible text"+countryNameField);
    }
    @CacheLookup
    @FindBy(css = "#response")
    WebElement countryNameField1;
    public void selectNationality1(String nationality1){
        Reporter.log("Select from visible dropdown"+ countryNameField1);
        selectByVisibleTextFromDropDown(countryNameField1,"Chile");
        CustomListeners.test.log(Status.PASS,"Select from visible text"+countryNameField1);
    }
    @CacheLookup
    @FindBy(css = "#response")
    WebElement countryNameField2;
    public void selectNationality2(String nationality2){
        Reporter.log("Select from visible dropdown"+ countryNameField2);
        selectByVisibleTextFromDropDown(countryNameField2,"Colombia");
        CustomListeners.test.log(Status.PASS,"Select from visible text"+countryNameField2);
    }
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    public void clickNextStepButton(){
        Reporter.log("Click on continue button"+continueButton);
        clickOnElement1(continueButton);
        CustomListeners.test.log(Status.PASS,"Click on continue button"+continueButton);
    }
}
