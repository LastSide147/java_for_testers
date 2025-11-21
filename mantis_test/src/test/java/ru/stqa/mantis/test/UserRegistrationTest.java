package ru.stqa.mantis.test;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest extends TestBase{

    @Test
    void canRegisterUser(String username) {
        var email = String.format("%s@localhost", username);
        // 1. создать пользователя (адрес) на почтовом сервере (JamesHelper)
        //   здесь нужно подключить выполнение canCreateUser() из JamesTest ?

        // 2. заполняем форму создания и отправляем (браузер)
        // Здесь нужно как при создании контактов разбить на кучу методов?
        click(By.linkText("Manage"));
        click(By.linkText("Users"));
        click(By.linkText("Users"));
        drivers.findElement(By.id("user-username")).sendKeys("homework");
        drivers.findElement(By.id("user-realname")).sendKeys("homework");
        drivers.findElement(By.id("email-field")).sendKeys("homework@localhost");
        click(By.linkText("Create User")); //driver.findElement(By.xpath("//input[@value='Create User']")).click();
        click(By.linkText("Proceed"));

        // 3. ждём почту (MailHelper)
        // создается пользователь в mantis. Но как получить ссылку на его почту не увидел.

        // извлекаем ссылку из письма
        // проходим по ссылке и завершаем регистрацию (браузер)
        // проверяем, что пользователь может залогиниться (HttpSessionHelper)
    }
}
