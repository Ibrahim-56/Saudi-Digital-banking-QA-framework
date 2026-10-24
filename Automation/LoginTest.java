package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;

public class LoginTest {
    private WebDriver driver;
    private String targetUrl;
    private String username;
    private String password;

    @BeforeMethod
    public void setUp() {
        targetUrl = System.getenv("TARGET_LOGIN_URL");
        username = System.getenv("TEST_USERNAME");
        password = System.getenv("TEST_PASSWORD");

        if (isBlank(targetUrl) || isBlank(username) || isBlank(password)) {
            throw new SkipException(
                "Set TARGET_LOGIN_URL, TEST_USERNAME, and TEST_PASSWORD to run the browser test."
            );
        }

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test
    public void successfulLogin() {
        driver.get(targetUrl);
        new LoginPage(driver).login(username, password);
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private boolean isBlank(String value) {
        return value == null || value.isBlank();
    }
}
