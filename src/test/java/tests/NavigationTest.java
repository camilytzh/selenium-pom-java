package tests;

import org.testng.annotations.Test;
import pages.AboutUsModal;
import pages.CartPage;
import pages.SignUpModal;

public class NavigationTest extends BaseTest{
    @Test
    public void navigateToAboutUsModal(){
        AboutUsModal aboutUsModal = new AboutUsModal(driver);
        aboutUsModal.goAboutUsModal();
        aboutUsModal.checkTitle();
        aboutUsModal.closeAboutUsModal();
    }
    @Test
    public void navigateToCartPage(){
        CartPage cartPage = new CartPage(driver);
        cartPage.goCartPage();
        cartPage.checkPlaceOrderBtnIsVisible();
    }
    @Test
    public void navigateToSignUpModal(){
        SignUpModal signUpModal = new SignUpModal(driver);
        signUpModal.goSignUpModal();
        signUpModal.checkElementsAreDisplayed();
    }
}
