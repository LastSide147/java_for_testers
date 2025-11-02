package manager;

import model.ContactData;
import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

//import static jdk.nio.zipfs.ZipFileAttributeView.AttrID.group;

public class ContactHelper extends HelperBase{

    public ContactHelper(ApplicationManager manager) {
       super(manager);
    }

    public void create(ContactData contact) {
        initContactCreation();
        fillForContact(contact);
        submitCreateCreation();
        returnToContactPage();
    }

    public void create(ContactData contact, GroupData group) {
        initContactCreation();
        fillForContact(contact);
        selectGroup(group);
        submitCreateCreation();
        returnToContactPage();
    }

    private void selectGroup(GroupData group) {
        new Select(manager.driver.findElement(By.name("new_group"))).selectByValue(group.id());
    }


    public void remove(ContactData contact) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        selectContact(contact);
        removeSelectedContact();
        returnToContactPage();
    }

    public void modifyContact(ContactData contact, ContactData modifiedContact) {
        selectContact(contact);
        initContactModification();
        fillContactForm(modifiedContact);
        submitContactModification();
        returnToHomePage();
    }

    private void returnToHomePage() {
        click(By.linkText("home page"));
    }

    private void submitContactModification() {
            click(By.name("update"));
    }

    private void fillContactForm(ContactData contact) {
        type(By.name("change firstname"), contact.firstname());
    }

    private void initContactModification() {
        click(By.cssSelector("a[href='edit.php?id=101'] img[alt='Edit']"));
    }

    private void removeSelectedContact() {
        click(By.name("delete"));
    }

    private void selectContact(ContactData contact)
    {
        click(By.cssSelector(String.format("input[value='%s']", contact.id())));
    }

    private void initContactCreation() {
        click(By.linkText("add new"));
    }

    private void fillForContact(ContactData contact) {
        type(By.name("firstname"), contact.firstname());
        type(By.name("lastname"), contact.lastname());
        type(By.name("address"), contact.address());
        type(By.name("home"), contact.phone());
        type(By.name("email"), contact.email());
        attach(By.name("photo"), contact.photo());
    }

    private void submitCreateCreation() {
        click(By.cssSelector("input:nth-child(75)"));
    }

    private void returnToContactPage() {
        click(By.linkText("home page"));
    }

    public int getCountContact() {
        return manager.driver.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getListContact() {
        var contacts = new ArrayList<ContactData>();
        var trs = manager.driver.findElements(By.cssSelector("tr[name='entry']"));
        for (var tr : trs) {
            var name = tr.getText();
            var checkbox = tr.findElement(By.name("selected[]"));
            var id = checkbox.getAttribute("value");
            var lastname = tr.findElements(By.tagName("td")).get(1).getText();
            var firstname = tr.findElements(By.tagName("td")).get(2).getText();
            contacts.add(new ContactData().withId(id).withFirstname(firstname).withLastname(lastname));
        }
        return contacts;
    }

    public void removeAllContact() {
        selectAllContact();
        removeSelectedContact();
    }

    private void selectAllContact() {
        var checkboxes = manager.driver.findElements(By.name("selected[]"));
        for (var checkbox : checkboxes) {
            checkbox.click();
        }
    }
}
