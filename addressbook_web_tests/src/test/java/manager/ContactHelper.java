package manager;

import model.ContactData;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

    public ContactHelper(ApplicationManager manager) {
       super(manager);
    }

//    public boolean isContactPresent() {
//        return manager.isElementPresent(By.name("selected[]"));
//    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillForContact(contact);
        submitCreateCreation();
        returnToContactPage();
    }

    public void removeContact(ContactData contact) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        selectContact(contact);
        removeSelectedContact();
        returnToContactPage();
        click(By.linkText("Logout"));
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
            var firstname = tr.findElements(By.tagName("td")).get(1).getText();
            contacts.add(new ContactData().withId(id).withFirstname(firstname));
        }
        return contacts;
    }



//    public void removeAllContact() {
//        selectAllGroups();
//        removeSelectedFroups();
//    }

//    private void removeSelectedFroups() {
//        click(By.name("delete"));
//    }
}
