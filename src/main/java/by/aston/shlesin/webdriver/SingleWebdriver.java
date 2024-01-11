package by.aston.shlesin.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SingleWebdriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            SingleWebdriver.getDriver().navigate().to("https://www.a1.by/");
            driver.manage().window().maximize();
            SingleWebdriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        }
        return driver;
    }
}
