package by.aston.shlesin.ua;

import by.aston.shlesin.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class A1Test extends BasePage {
    @Test
    public void checkMessageSubscribe()  {
        a1Page.clickButtonAcceptСookie();
        a1Page.sendKeysEmail(User.getRundomCorrectEmail());
        a1Page.addMessagesToCatalog();
        Assertions.assertEquals(a1Page.addExpectedKatalogItems(), a1Page.addMessagesToCatalog());
    }
}
