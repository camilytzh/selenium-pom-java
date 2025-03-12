package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpModal extends BasePage{
    @FindBy(id = "#sign-username")
    private WebElement usernameInput;
    @FindBy(id = "#sign-password")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")
    private WebElement closeBtn;
    @FindBy(css = "button[onclick=\"register()\"]")
    private WebElement signUpBtn;
    public SignUpModal(WebDriver driver) {
        super(driver);
    }
}
