package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginModal extends BasePage{
    @FindBy(id = "loginusername")
    private WebElement usernameInput;
    @FindBy(id = "loginpassword")
    private WebElement passwordInput;
    @FindBy(css = "button[onclick=\"logIn()\"]")
    private WebElement loginBtn;
    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")
    private WebElement closeBtn;
    @FindBy(id = "logout2")
    private WebElement logoutBtn;
    @FindBy(id = "nameofuser")
    private WebElement loginCheck;

    public LoginModal(WebDriver driver) {
        super(driver);
    }
}
