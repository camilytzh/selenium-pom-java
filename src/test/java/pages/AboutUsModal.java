package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsModal extends BasePage{
    @FindBy(xpath = "//a[@data-target=\"#videoModal\"]")
    private WebElement aboutUsNav;
    @FindBy(xpath = "//*[@id=\"videoModal\"]/div/div/div[3]/button[1]")
    private WebElement closeBtn;
    public AboutUsModal(WebDriver driver) {
        super(driver);
    }
}
