package by.aston.shlesin.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import by.aston.shlesin.webdriver.SingleWebdriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class A1Page {
    private String buttonAcceptСookie = "//button[@data-action-button='acceptAll']";
    private String inputEmailForSubscribe = "//input[@class='form-input']";
    private String messegesSubscribe = "//p[@class='iziToast-message slideIn']/div/div";
    private WebDriver driver;

    public A1Page() {
        this.driver = SingleWebdriver.getDriver();
    }

    public void clickButtonAcceptСookie() {
        driver.findElement(By.xpath(buttonAcceptСookie)).click();
    }

       public void sendKeys(String email) throws InterruptedException {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.findElement(By.xpath(inputEmailForSubscribe)).sendKeys(email + Keys.ENTER);
    }

    public List<WebElement> setItemCatalog() {
        return driver.findElements(By.xpath(messegesSubscribe));
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
