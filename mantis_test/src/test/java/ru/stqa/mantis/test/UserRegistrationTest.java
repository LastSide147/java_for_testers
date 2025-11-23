package ru.stqa.mantis.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.regex.Pattern;

public class UserRegistrationTest extends TestBase{

    @Test
    void canRegisterUser() throws Exception {
//         1. создать пользователя (адрес) на почтовом сервере (JamesHelper)
        app.jamesCli().addUser("homework@localhost", "password");

//      Вход в мантис
        app.http().login("administrator", "root");
        Assertions.assertTrue(app.http().isLoggedIn());

        // 2. заполняем форму создания и отправляем (браузер)
        app.registration().loginAdminUI();
        app.registration().createUser();

        // 3. ждём почту (MailHelper)
        var messages = app.mail().receive("homework@localhost", "password", Duration.ofSeconds(60));
        var text = messages.get(0).content();
        var pattern = Pattern.compile("http://\\S*");
        var matcher = pattern.matcher(text);
        String url = null;
        if(matcher.find()) {
            url = text.substring(matcher.start(), matcher.end());
            System.out.println(url);
        }
        // 4. извлекаем ссылку из письма


        // 5. проходим по ссылке и завершаем регистрацию (браузер)
        app.driver().get(url);
//        app.registration().newDataForLogin();ы
//
//        // 6. проверяем, что пользователь может залогиниться (HttpSessionHelper)
//        app.http().login("homework", "pass");
//        Assertions.assertTrue(app.http().isLoggedIn());

    }
}
