package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//This Java class manages the WebDriver instance by launching the browser before tests and quitting it after tests.

public class Hooks {

    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");

        webDriver = new ChromeDriver(options);
        String appUrl = "https://staging.reservation.umai.io/en/widget/kwc-automated";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){
        webDriver.quit();
    }
}
