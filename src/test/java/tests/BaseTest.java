package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    @BeforeMethod
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver, "https://www.demoblaze.com/index.html");
    }
    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
