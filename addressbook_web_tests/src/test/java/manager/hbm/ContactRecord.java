package manager.hbm;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import model.ContactData;

@Entity
@Table(name = "addressbook")
public class ContactRecord {

    @Id
    public int id;
    public String firstname;
    public String lastname;
    public String address;
    public String home;
    public String mobile;
    public String work;
    public String phone2;

//    @Column(name="home")
//    public String phone;
    public String email;

    public ContactRecord() {
    }

    public ContactRecord(int id, String firstname, String lastname, String address, String phone, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
//        this.phone = phone;
        this.email = email;
    }
}
