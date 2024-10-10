package Tests;

import Pages.AfterLoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBases {

    @Test
    public void ValidateLoginWithValidCredential() {

        //Navigate to Website
        homePage.NavigateToWebsite();
        //Verify that home page is visible successfully
        homePage.validateHomePage();
        // Click on 'Signup / Login' button
        homePage.ClickSignUpOrLogInButton();



        //Verify 'Login to your account' is visible
        loginPage.VerifyLoginToYourAccount();
        //Enter correct email address and password
        loginPage.EnterEmail("kh.ahmednassar@gmail.com");
        loginPage.EnterPassword("123");
        //Click 'login' button
        loginPage.ClickLogin();



        // Verify that 'Logged in as username' is visible
        afterLoginPage.VerifyLoggedIn();
        //Click 'Delete Account' button
        afterLoginPage.DeleteAccount();
        //Verify that 'ACCOUNT DELETED!' is visible
        afterLoginPage.VerifyAccountDeleted();

    }

}
