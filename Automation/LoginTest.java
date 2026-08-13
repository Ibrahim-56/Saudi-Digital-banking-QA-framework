package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void successfulLogin() {

        driver.get("https://example.com/login");

        driver.findElement(By.id("username"))
                .sendKeys("customer01");

        driver.findElement(By.id("password"))
                .sendKeys("Password123");

        driver.findElement(By.id("loginBtn"))
                .click();

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("dashboard"));
    }
}
