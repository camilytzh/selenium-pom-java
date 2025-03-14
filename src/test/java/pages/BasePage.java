package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class BasePage {
    @FindBy(css = "a[data-target=\"#videoModal\"]")
    private WebElement aboutUsNav;
    @FindBy(css = ".nav-item [href=\"index.html\"]")
    private WebElement homeNav;
    @FindBy(xpath = "//a[text() = 'Contact']")
    private WebElement contactNav;
    @FindBy(id = "signin2")
    private WebElement signUpNav;
    @FindBy(id = "cartur")
    private WebElement cartNav;
    @FindBy(id = "login2")
    private WebElement loginNav;
    protected WebDriver driver;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    protected void click(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    protected void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected Alert waitForAlert() {
        return wait.until(ExpectedConditions.alertIsPresent());
    }
    public String getCurrentPageURL()
    {
        return this.driver.getCurrentUrl();
    }
    public void goHomePage(){
        click(homeNav);
    }
    public void goContactModal(){
        click(contactNav);
    }
    public void goSignUpModal(){
        click(signUpNav);
    }
    public void goCartPage(){
        click(cartNav);
    }
    public void goLoginModal(){
        click(loginNav);
    }
    public void goAboutUsModal(){
        click(aboutUsNav);
    }
}
