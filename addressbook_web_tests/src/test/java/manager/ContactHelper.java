package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper {

    private final ApplicationManager manager;

    public ContactHelper(ApplicationManager manager) {
       this.manager = manager;
    }

//    public void openContactPage() {
//        manager.driver.findElement(By.linkText("home")).click();
//    }

    public boolean isContactPresent() {
//        openContactPage();
        return manager.isElementPresent(By.name("selected[]"));
    }

    public void createContact(ContactData contact) {
//        openContactPage();
        manager.driver.findElement(By.linkText("add new")).click();
        manager.driver.findElement(By.name("firstname")).click();
        manager.driver.findElement(By.name("firstname")).sendKeys(contact.firstname());
        manager.driver.findElement(By.name("lastname")).click();
        manager.driver.findElement(By.name("lastname")).sendKeys(contact.lastname());
        manager.driver.findElement(By.name("address")).click();
        manager.driver.findElement(By.name("address")).sendKeys(contact.address());
        manager.driver.findElement(By.name("home")).click();
        manager.driver.findElement(By.name("home")).sendKeys(contact.phone());
        manager.driver.findElement(By.name("email")).click();
        manager.driver.findElement(By.name("email")).sendKeys(contact.email());
        manager.driver.findElement(By.cssSelector("input:nth-child(75)")).click();
        manager.driver.findElement(By.linkText("home page")).click();
    }

    public void removeContact() {
//        openContactPage();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        manager.driver.findElement(By.name("selected[]")).click();
        manager.driver.findElement(By.name("delete")).click();
        manager.driver.findElement(By.linkText("home page")).click();
        manager.driver.findElement(By.linkText("Logout")).click();
    }

    public int getCountContact() {
//        openContactPage();
        return manager.driver.findElements(By.name("selected[]")).size();
    }

//    public void removeAllContact() {
//        selectAllGroups();
//        removeSelectedFroups();
//    }

//    private void removeSelectedFroups() {
//        click(By.name("delete"));
//    }
}
