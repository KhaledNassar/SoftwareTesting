package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AfterLoginPage {

    WebDriver driver;

    public AfterLoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void VerifyLoggedIn() {
        Assert.assertTrue( driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[10]/a")).isDisplayed() );
    }

    public void DeleteAccount() {
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a")).click();
    }

    public void VerifyAccountDeleted() {
        Assert.assertTrue( driver.findElement(By.xpath("/html/body/section/div/div/div/h2/b")).isDisplayed() );
    }


}
