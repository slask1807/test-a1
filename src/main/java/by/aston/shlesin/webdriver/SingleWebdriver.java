package by.aston.shlesin.webdriver;

import by.aston.shlesin.pageobject.A1Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SingleWebdriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            SingleWebdriver.getDriver().navigate().to("https://www.a1.by/");
            driver.manage().window().maximize();
        }
        return driver;
    }
}
