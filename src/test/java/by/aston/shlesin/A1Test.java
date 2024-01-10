package by.aston.shlesin;

import by.aston.shlesin.domain.User;
import by.aston.shlesin.pageobject.A1Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A1Test extends BasePage {
    @Test
    public void checkMessageSubscribe() throws InterruptedException {
        a1Page.clickButtonAcceptСookie();
        a1Page.sendKeys(User.getRundomCorrectEmail());
        a1Page.addMessagesToCatalog();
        Assertions.assertEquals(a1Page.addExpectedKatalogItems(), a1Page.addMessagesToCatalog());
    }
}
