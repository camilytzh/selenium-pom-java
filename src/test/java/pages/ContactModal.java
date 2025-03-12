package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactModal extends BasePage{
    @FindBy(id = "recipient-email")
    private WebElement emailInput;
    @FindBy(id = "recipient-name")
    private WebElement nameInput;
    @FindBy(id = "message-text")
    private WebElement messageInput;
    @FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]")
    private WebElement closeBtn;
    @FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
    private WebElement sendMsgBtn;
    public ContactModal(WebDriver driver) {
        super(driver);
    }
}
