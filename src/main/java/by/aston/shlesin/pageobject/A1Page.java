package by.aston.shlesin.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import by.aston.shlesin.webdriver.SingleWebdriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class A1Page {
    private WebDriver driver;

    public A1Page() {
        this.driver = SingleWebdriver.getDriver();
    }

    @FindBy(xpath = "//button[@class='button button--primary button--fixed-width' and @data-action-button='acceptAll']")
    private WebElement buttonAcceptСookie;

    @FindBy(xpath = "//input[@class='form-input']")
    private WebElement inputEmailForSubscribe;

    @FindBy(css = "body")
    private WebElement bodyForMovingDown;

    @FindBy(xpath = "//p[@class='iziToast-message slideIn']/div/div")
    private List<WebElement> messegesSubscribe;

    public WebElement waitForWebElementVisibilityInSeconds(WebElement element, int secondsToWait) {
        return new WebDriverWait(driver, Duration.ofSeconds(secondsToWait))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public void clickButtonAcceptСookie() {
        buttonAcceptСookie.click();
    }

    public void sendKeysEmail(String email) {
        scrollPageDown();
        waitForWebElementVisibilityInSeconds(inputEmailForSubscribe, 20000);
        inputEmailForSubscribe.sendKeys(email + Keys.ENTER);
    }

    public void scrollPageDown() {
        JavascriptExecutor jse6 = (JavascriptExecutor) driver;
        jse6.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public List<String> addMessagesToCatalog() {
        List<WebElement> itemList = messegesSubscribe;
        List<String> catalogItemList = new ArrayList<>();
        for (WebElement itemlist : itemList) {
            catalogItemList.add(itemlist.getText());
        }
        return catalogItemList;
    }

    public List<String> addExpectedKatalogItems() {
        List<String> expectedKatalogItems = new ArrayList<>();
        expectedKatalogItems.add("Вы подписались");
        expectedKatalogItems.add("Вы успешно подписались на нашу новостную рассылку.");
        return expectedKatalogItems;
    }
}
