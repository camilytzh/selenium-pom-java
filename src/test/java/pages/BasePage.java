package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class BasePage {
    @FindBy(xpath = "//a[@data-target=\"#videoModal\"]")
    private WebElement aboutUsNav;
    @FindBy(css = ".nav-item [href=\"index.html\"]")
    private WebElement homeNav;
    @FindBy(xpath = "//a[text() = 'Contact']")
    private WebElement contactNav;
    @FindBy(id = "#signin2")
    private WebElement signUpNav;
    @FindBy(id = "#cartur")
    private WebElement cartNav;
    @FindBy(id = "#login2")
    private WebElement loginNav;
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getCurrentPageURL()
    {
        return this.driver.getCurrentUrl();
    }
    public void goHomePage(){
        this.homeNav.click();
    }
    public void goContactModal(){
        this.contactNav.click();
    }
    public void goSignUpModal(){
        this.signUpNav.click();
    }
    public void goCartPage(){
        this.cartNav.click();
    }
    public void goLoginModal(){
        this.loginNav.click();
    }
    public void goAboutUsModal(){
        this.aboutUsNav.click();
    }
}
