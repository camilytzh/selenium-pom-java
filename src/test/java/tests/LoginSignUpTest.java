package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginModal;
import pages.SignUpModal;
import utils.ConfigReader;
import utils.TestHelper;


public class LoginSignUpTest extends BaseTest{
    private String username;
    private String password;
    private LoginModal login;
    private SignUpModal signUp;

    @BeforeMethod
    public void setUp() {
        username = TestHelper.generateRandomUsername();
        password = TestHelper.generateRandomPassword();
        login = new LoginModal(driver);
        signUp = new SignUpModal(driver);
    }
    @Test
    public void successfulLogin(){
        login.goLoginModal();
        login.login(ConfigReader.getUsername(), ConfigReader.getPassword());
        login.verifyUserIsLogged();
    }
    @Test
    public void loginWithIncorrectCredentials(){
        login.goLoginModal();
        login.login(username,password);
        login.checkInvalidLoginMessage();
    }
    @Test
    public void successfulSignUp(){
        String validSignUp = "Sign up successful.";
        signUp.goSignUpModal();
        signUp.signUp(username, password);
        signUp.checkSignUpMessage(validSignUp);
    }
    @Test
    public void signUpWithExistingUser(){
        String validSignUp = "This user already exist.";
        signUp.goSignUpModal();
        signUp.signUp(ConfigReader.getUsername(), ConfigReader.getPassword());
        signUp.checkSignUpMessage(validSignUp);
    }
}
