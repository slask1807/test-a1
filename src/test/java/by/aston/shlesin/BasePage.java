package by.aston.shlesin;

import org.junit.jupiter.api.AfterEach;
import webdriver.SingleWebdriver;

public class BasePage {
    @AfterEach
    public void baseFinish() {
        SingleWebdriver.getDriver().quit();
    }
}
