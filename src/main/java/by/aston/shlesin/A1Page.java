package by.aston.shlesin;

import org.openqa.selenium.WebDriver;
import webdriver.SingleWebdriver;

public class A1Page {

    private WebDriver driver;

    public A1Page() {
        this.driver = SingleWebdriver.getDriver();
    }
}
