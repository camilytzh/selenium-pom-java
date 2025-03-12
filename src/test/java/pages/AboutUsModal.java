package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class AboutUsModal extends BasePage{
    @FindBy(xpath = "//*[@id=\"videoModal\"]/div/div/div[3]/button[1]")
    private WebElement closeBtn;
    @FindBy(xpath = "//*[@id=\"videoModal\"]/div/div/div/h5")
    private WebElement topTitle;

    SoftAssert softAssert = new SoftAssert();
    public void closeAboutUsModal(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(closeBtn));
        this.closeBtn.click();
    }
    public void checkTitle(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(topTitle));
        String currentText = topTitle.getText();
        softAssert.assertEquals(currentText, "About us");
        softAssert.assertAll();
    }
    public AboutUsModal(WebDriver driver) {
        super(driver);
    }
}
