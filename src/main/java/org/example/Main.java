package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        String appUrl = "https://staging.reservation.umai.io/en/widget/kwc-automated";
        driver.get(appUrl);
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.quit();
    }
}