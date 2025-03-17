package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class HomePage extends BasePage{
    @FindBy(css = "a[onclick=\"byCat('phone')\"]")
    private WebElement phonesCategory;
    @FindBy(css = "a[onclick=\"byCat('notebook')\"]")
    private WebElement laptopsCategory;
    @FindBy(css = "a[onclick=\"byCat('monitor')\"]")
    private WebElement monitorsCategory;
    @FindBy(css = ".card-title a[href=\"prod.html?idp_=1\"]")
    private WebElement firstPhone;
    @FindBy(css = ".card-title a[href=\"prod.html?idp_=8\"]")
    private WebElement firstLaptop;
    @FindBy(css = ".card-title a[href=\"prod.html?idp_=10\"]")
    private WebElement firstMonitor;
    @FindBy(className = "card-block")
    private List<WebElement> phonesList;
    @FindBy(xpath = "//*[@class=\"col-lg-4 col-md-6 mb-4\"]/div/a")
    private List<WebElement> laptopsList;
    @FindBy(xpath = "//*[@class=\"col-lg-4 col-md-6 mb-4\"]/div/a")
    private List<WebElement> monitorsList;
    @FindBy(xpath = "//*[@class=\"col-sm-12 col-md-6 col-lg-6\"]/a")
    private List<WebElement> addToCartBtn;
    SoftAssert softAssert = new SoftAssert();
    public void verifyCategoryIsFiltered(WebElement category, WebElement firstItem, List<WebElement> itemList) {
        click(category);
        waitForVisibility(firstItem);
        softAssert.assertTrue(!itemList.isEmpty(), "No products were found in this category");
        softAssert.assertAll();
    }
    public void verifyPhonesAreFiltered(){
        verifyCategoryIsFiltered(phonesCategory, firstPhone,phonesList);
    }
    public void verifyLaptopsAreFiltered(){
        verifyCategoryIsFiltered(laptopsCategory, firstLaptop, laptopsList);
    }
    public void verifyMonitorsAreFiltered(){
        verifyCategoryIsFiltered(monitorsCategory, firstMonitor, monitorsList);
    }
    public HomePage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }
    public HomePage(WebDriver driver){
        super(driver);
    }
}
