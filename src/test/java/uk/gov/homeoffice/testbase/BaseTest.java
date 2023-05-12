package uk.gov.homeoffice.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.gov.homeoffice.propertyreader.PropertyReader;
import uk.gov.homeoffice.utilities.Utility;

public class BaseTest extends Utility{

    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
