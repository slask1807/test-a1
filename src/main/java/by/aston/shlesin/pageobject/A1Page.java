package by.aston.shlesin.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import by.aston.shlesin.webdriver.SingleWebdriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void clickButtonAcceptСookie() {
        buttonAcceptСookie.click();
    }

    public void sendKeys(String email) throws InterruptedException {
        bodyForMovingDown.sendKeys(Keys.CONTROL, Keys.END);
        bodyForMovingDown.sendKeys(Keys.CONTROL, Keys.END);
        inputEmailForSubscribe.sendKeys(email + Keys.ENTER);
    }

    public List<WebElement> setItemCatalog() {
        return messegesSubscribe;
    }

    public List<String> addMessagesToCatalog() {
        List<WebElement> itemList = setItemCatalog();
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
