package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LoginModal;
import utils.ConfigReader;


public class LoginSignUpTest extends BaseTest{
    @Test
    public void successfulLogin(){
        LoginModal login = new LoginModal(driver);
        login.goLoginModal();
        login.login(ConfigReader.getUsername(), ConfigReader.getPassword());
        login.verifyUserIsLogged();
    }
    @Test
    public void loginWithIncorrectCredentials(){
        LoginModal login = new LoginModal(driver);
        login.goLoginModal();
        login.login("AXNCBFUHBM05","BIMUGT6398");
        login.checkInvalidLoginMessage();
    }
}
