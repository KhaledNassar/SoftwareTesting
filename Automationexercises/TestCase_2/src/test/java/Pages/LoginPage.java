package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void  VerifyLoginToYourAccount() {
        Assert.assertTrue( driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2")).isDisplayed());
    }

    public void EnterEmail(String email) {
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys(email);
    }

    public void EnterPassword(String password) {
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys(password);
    }

    public void ClickLogin () {
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
    }


}




