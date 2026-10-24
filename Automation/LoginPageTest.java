package tests;

import org.mockito.Mockito;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.mockito.Mockito.*;

public class LoginPageTest {
    @Test
    public void loginFillsCredentialsAndClicksButton() {
        WebDriver driver = mock(WebDriver.class);
        WebElement username = mock(WebElement.class);
        WebElement password = mock(WebElement.class);
        WebElement loginButton = mock(WebElement.class);

        when(driver.findElement(By.id("username"))).thenReturn(username);
        when(driver.findElement(By.id("password"))).thenReturn(password);
        when(driver.findElement(By.id("loginBtn"))).thenReturn(loginButton);

        new LoginPage(driver).login("sample-user", "sample-password");

        verify(username).sendKeys("sample-user");
        verify(password).sendKeys("sample-password");
        verify(loginButton).click();
    }
}
