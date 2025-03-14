package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import utils.ConfigReader;

import java.time.Duration;

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
    SoftAssert softAssert = new SoftAssert();
    public void login(String username, String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(usernameInput));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
    public void verifyUserIsLogged(){
        waitForVisibility(loginCheck);
        softAssert.assertTrue(loginCheck.isDisplayed());
        softAssert.assertAll();
    }
    public void checkInvalidLoginMessage(){
        String expectedAlert = "User does not exist.";
        Alert alert = waitForAlert();
        String alertText = alert.getText();
        softAssert.assertEquals(alertText, expectedAlert);
        softAssert.assertAll();
        alert.accept();
    }

    public LoginModal(WebDriver driver) {
        super(driver);
    }
}
