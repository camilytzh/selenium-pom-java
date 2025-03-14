package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.UUID;

public class SignUpModal extends BasePage{
    @FindBy(id = "sign-username")
    private WebElement usernameInput;
    @FindBy(id = "sign-password")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[1]")
    private WebElement closeBtn;
    @FindBy(css = "button[onclick=\"register()\"]")
    private WebElement signUpBtn;
    SoftAssert softAssert = new SoftAssert();
    public void checkElementsAreDisplayed(){
        waitForVisibility(usernameInput);
        softAssert.assertTrue(usernameInput.isDisplayed());
        softAssert.assertTrue(passwordInput.isDisplayed());
        softAssert.assertTrue(closeBtn.isDisplayed());
        softAssert.assertTrue(signUpBtn.isDisplayed());
        softAssert.assertAll();
    }
    public void signUp(String username, String password){
        waitForVisibility(usernameInput);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        click(signUpBtn);
    }
    public void checkSignUpMessage(String message){
        Alert alert = waitForAlert();
        String alertText = alert.getText();
        softAssert.assertEquals(alertText, message);
        softAssert.assertAll();
        alert.accept();
    }
    public SignUpModal(WebDriver driver) {
        super(driver);
    }
}
