package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void NavigateToWebsite() {
        driver.navigate().to("https://automationexercise.com/");
    }

    public void validateHomePage(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href = '/'][@style = 'color: orange;']")).isDisplayed());
    }

    public void ClickSignUpOrLogInButton () {
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }




}
