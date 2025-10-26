package tests;

import model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ContactModificationTest extends TestBase{

    @Test
    void canModifyContact(){
        if (app.contacts().getCountContact() == 0) {
            app.contacts().create(new ContactData("", "Java", "Tester", "Russia", "111222333", "test@mail.ru", ""));
        }
        var oldContacts = app.contacts().getListContact();
        var rnd = new Random();
        var index = rnd.nextInt(oldContacts.size());
        var testContactData = new ContactData().withFirstname("change firstname");
        app.contacts().modifyContact(oldContacts.get(index), testContactData);
        var newContacts = app.contacts().getListContact();
        var expectedList = new ArrayList<>(oldContacts);
        expectedList.set(index, testContactData.withId(oldContacts.get(index).id()));
        Comparator<ContactData> compareById = (o1, o2) -> {
            return Integer.compare(Integer.parseInt(o1.id()), Integer.parseInt(o2.id()));
        };
        newContacts.sort(compareById);
        expectedList.sort(compareById);
        Assertions.assertEquals(newContacts, expectedList);
    }
}
