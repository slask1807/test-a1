package by.aston.shlesin.domain;

import com.github.javafaker.Faker;

public class User {
    public static String getRundomCorrectEmail() {
        Faker faker = new Faker();
        return faker.internet().safeEmailAddress(faker.name().firstName());
    }
}
