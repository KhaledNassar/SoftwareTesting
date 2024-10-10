package Tests;

import Pages.AfterLoginPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBases {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    AfterLoginPage afterLoginPage;


    @BeforeClass
    public void PreConditions(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        afterLoginPage = new AfterLoginPage(driver);

    }


    @AfterClass
    public void PostConditions() {
        driver.quit();
    }
}
