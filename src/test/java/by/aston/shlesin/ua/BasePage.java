package by.aston.shlesin.ua;

import by.aston.shlesin.pageobject.A1Page;
import by.aston.shlesin.webdriver.SingleWebdriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public A1Page a1Page;

    @BeforeEach
    public void start() {
        WebDriverManager.chromedriver().setup();
        a1Page = PageFactory.initElements(SingleWebdriver.getDriver(), A1Page.class);
    }

    @AfterEach
    public void baseFinish() {
        SingleWebdriver.getDriver().quit();
    }
}
