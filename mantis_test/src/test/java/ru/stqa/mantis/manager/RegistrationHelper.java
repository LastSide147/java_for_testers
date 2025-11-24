package ru.stqa.mantis.manager;

import org.openqa.selenium.By;

public class RegistrationHelper extends HelperBase {

    public RegistrationHelper(ApplicationManager manager) {
        super(manager);
    }

    public void loginAdminUI() {
        manager.driver().get(manager.property("web.baseUrl") + "/login_page.php");
        type(By.name("username"), manager.property("web.username"));
        click(By.cssSelector("input[type='submit']"));
        type(By.name("password"), manager.property("web.password"));
        click(By.cssSelector("input[type='submit']"));
    }

    public void createUser(String username, String email) {
        click(By.linkText("Manage"));
        click(By.linkText("Users"));
        click(By.linkText("Create New Account"));

        manager.driver().findElement(By.id("user-username")).sendKeys(username);
        manager.driver().findElement(By.id("user-realname")).sendKeys(username);
        manager.driver().findElement(By.id("email-field")).sendKeys(email);
        manager.driver.findElement(By.xpath("//input[@value='Create User']")).click();
        click(By.linkText("Proceed"));
    }

    public void newDataForLogin() {
        manager.driver.findElement(By.id("password")).sendKeys("pass");
        manager.driver.findElement(By.id("password-confirm")).sendKeys("pass");
        click(By.cssSelector("button.btn.btn-success"));
    }
}
