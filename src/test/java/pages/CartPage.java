package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class CartPage extends BasePage{
    @FindBy(xpath = "//*[@class=\"success\"]/td[4]/a")
    private WebElement deleteItemBtn;
    @FindBy(css = "button[class=\"btn btn-success\"]")
    private WebElement placeOrderBtn;
    @FindBy(id = "name")
    private WebElement nameInputForm;
    @FindBy(id = "country")
    private WebElement countryInputForm;
    @FindBy(id = "city")
    private WebElement cityInputForm;
    @FindBy(id = "card")
    private WebElement creditCardInputForm;
    @FindBy(id = "month")
    private WebElement monthInputForm;
    @FindBy(id = "year")
    private WebElement yearInputForm;
    @FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[1]")
    private WebElement closeBtn;
    @FindBy(css = "button[onclick=\"purchaseOrder()\"]")
    private WebElement purchaseBtn;
    @FindBy(css = "button[class=\"confirm btn btn-lg btn-primary\"]")
    private WebElement confirmationBtn;
    SoftAssert softAssert = new SoftAssert();
    public void checkPlaceOrderBtnIsVisible(){
        waitForVisibility(placeOrderBtn);
        softAssert.assertTrue(placeOrderBtn.isDisplayed());
        softAssert.assertAll();
    }
    public CartPage(WebDriver driver) {
        super(driver);
    }
}
