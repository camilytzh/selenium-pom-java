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
    @FindBy(xpath = "//*[@id=\"contcar\"]/div/div/div[1]")
    private WebElement firstSlide;
    @FindBy(xpath = "//*[@id=\"contcar\"]/div/div/div[2]")
    private WebElement secondSlide;
    @FindBy(xpath = "//*[@id=\"contcar\"]/div/div/div[3]")
    private WebElement thirdSlide;
    @FindBy(xpath = "//*[@id=\"contcar\"]/div/a[1]")
    private WebElement prevBtn;
    @FindBy(css = "li[data-slide-to=\"0\"]")
    private WebElement firstIndicator;
    @FindBy(css = "li[data-slide-to=\"1\"]")
    private WebElement secondIndicator;
    @FindBy(css = "li[data-slide-to=\"2\"]")
    private WebElement thirdIndicator;
    @FindBy(xpath = "//*[@id=\"contcar\"]/div/a[2]")
    private WebElement nextBtn;
    @FindBy(css = "div[id=\"contcont\"]")
    private WebElement productsContent;
    @FindBy(css = "a[onclick=\"byCat('phone')\"]")
    private WebElement phonesCategory;
    @FindBy(css = "a[onclick=\"byCat('notebook')\"]")
    private WebElement laptopsCategory;
    @FindBy(css = "a[onclick=\"byCat('monitor')\"]")
    private WebElement monitorsCategory;
    @FindBy(xpath = "//*[@class=\"col-lg-4 col-md-6 mb-4\"]/div/a")
    private List<WebElement> phones;
    @FindBy(xpath = "//*[@class=\"col-lg-4 col-md-6 mb-4\"]/div/a")
    private List<WebElement> laptops;
    @FindBy(xpath = "//*[@class=\"col-lg-4 col-md-6 mb-4\"]/div/a")
    private List<WebElement> monitors;
    @FindBy(xpath = "//*[@class=\"col-sm-12 col-md-6 col-lg-6\"]/a")
    private List<WebElement> addToCartBtn;
    public HomePage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }
}
