import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class exampleTest {
    private WebDriver driver;
    private By loginBtn = By.cssSelector(ta("loginBtn", "a.login-btn"));
    private By signupBtn = By.cssSelector(ta("signupBtn", "div.sign-up-container > a"));
    private By emailFl = By.name(ta("emailFl", "email"));

    public static final String USERNAME = "USERNAME";
    public static final String AUTOMATE_KEY = "AUTOMATE_KEY";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "62.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");

        driver = new TrueAutomationDriver(new URL(URL), caps);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void exampleTest() {
        driver.get("https://trueautomation.io");

        driver.findElement(loginBtn).click();
        driver.findElement(signupBtn).click();

        driver.findElement(emailFl).sendKeys("your@mail.com");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}