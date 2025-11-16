package ru.stqa.mantis.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase{

    @Test
    void canLogin() {
        app.http().login("administrator", "root");
        Assertions.assertTrue(app.http().isLoggedIn());
    }
}
