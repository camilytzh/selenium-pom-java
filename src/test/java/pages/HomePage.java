package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class HomePage extends BasePage{
    @FindBy(css = "img[alt=\"First slide\"]")
    private WebElement firstSlide;
    @FindBy(css = "img[alt=\"Second slide\"]")
    private WebElement secondSlide;
    @FindBy(css = "img[alt=\"Third slide\"]")
    private WebElement thirdSlide;
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
