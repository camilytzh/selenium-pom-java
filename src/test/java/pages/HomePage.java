package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(css = ".nav-item [href=\"index.html\"]")
    private WebElement homeNav;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
