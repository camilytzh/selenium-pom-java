package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(id = "#cartur")
    private WebElement cartNav;

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
