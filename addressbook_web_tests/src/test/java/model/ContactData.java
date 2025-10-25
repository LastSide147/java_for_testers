package model;

public record ContactData(String id, String firstname, String lastname, String address, String phone, String email) {

    public ContactData () {
        this("", "", "", "", "", "");
    }

    public ContactData withId(String id) {
        return new ContactData( id, firstname, this.lastname, this.address, this.phone, this.email);
    }

    public ContactData withFirstname(String firstname) {
        return new ContactData( this.id, firstname, this.lastname, this.address, this.phone, this.email);
    }

    public ContactData withLastname(String lastname) {
        return new ContactData( this.id, this.firstname, lastname, this.address, this.phone, this.email);
    }

    public ContactData withAddress(String address) {
        return new ContactData( this.id, this.firstname, this.lastname, address, this.phone, this.email);
    }

    public ContactData withPhone(String phone) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, phone, this.email);
    }

    public ContactData withEmail(String email) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, email);
    }
}