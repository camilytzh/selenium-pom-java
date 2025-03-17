package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class PurchaseFlowTest extends BaseTest{
    private HomePage homePage;
    @BeforeMethod
    public void setup(){
        homePage = new HomePage(driver);
    }
    @Test
    public void verifyCategoryMenu(){
        homePage.verifyPhonesAreFiltered();
        homePage.verifyLaptopsAreFiltered();
        homePage.verifyMonitorsAreFiltered();
    }
}
