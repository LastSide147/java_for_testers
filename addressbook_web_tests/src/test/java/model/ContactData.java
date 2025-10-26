package model;

public record ContactData(String id, String firstname, String lastname, String address, String phone, String email, String photo) {

    public ContactData () {
        this("", "", "", "", "", "", "");
    }

    public ContactData withId(String id) {
        return new ContactData( id, firstname, this.lastname, this.address, this.phone, this.email, this.photo);
    }

    public ContactData withFirstname(String firstname) {
        return new ContactData( this.id, firstname, this.lastname, this.address, this.phone, this.email, this.photo);
    }

    public ContactData withLastname(String lastname) {
        return new ContactData( this.id, this.firstname, lastname, this.address, this.phone, this.email, this.photo);
    }

    public ContactData withAddress(String address) {
        return new ContactData( this.id, this.firstname, this.lastname, address, this.phone, this.email, this.photo);
    }

    public ContactData withPhone(String phone) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, phone, this.email, this.photo);
    }

    public ContactData withEmail(String email) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, email, this.photo);
    }

    public ContactData withPhoto(String photo) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, photo);
    }

}