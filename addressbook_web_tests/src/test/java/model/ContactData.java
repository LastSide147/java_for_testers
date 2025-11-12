package model;

public record ContactData(
        String id,
        String firstname,
        String lastname,
        String address,
        String phone,
        String email,
        String email2,
        String email3,
        String mobile,
        String work,
        String secondary,
        String photo,
        String home
) {

    public ContactData () {
        this("", "", "", "", "", "", "", "", "", "", "", "", "");
    }

    public ContactData withId(String id) {
        return new ContactData( id, firstname, this.lastname, this.address, this.phone, this.email, this.email2, this.email3, this.mobile, this.work, this.secondary, this.photo, this.home);
    }

    public ContactData withFirstname(String firstname) {
        return new ContactData( this.id, firstname, this.lastname, this.address, this.phone, this.email, this.email2, this.email3, this.mobile, this.work, this.secondary, this.photo, this.home);
    }

    public ContactData withLastname(String lastname) {
        return new ContactData( this.id, this.firstname, lastname, this.address, this.phone, this.email, this.email2, this.email3, this.mobile, this.work, this.secondary, this.photo, this.home);
    }

    public ContactData withAddress(String address) {
        return new ContactData( this.id, this.firstname, this.lastname, address, this.phone, this.email, this.email2, this.email3, this.mobile, this.work, this.secondary, this.photo, this.home);
    }

    public ContactData withPhone(String phone) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, phone, this.email, this.email2, this.email3, this.mobile, this.work, this.secondary, this.photo, this.home);
    }

    public ContactData withEmail(String email) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, email, this.email2, this.email3, this.mobile, this.work, this.secondary, this.photo, this.home);
    }


    public ContactData withEmail2(String email2) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, email, email2, this.email3, this.mobile, this.work, this.secondary, this.photo, this.home);
    }

    public ContactData withEmail3(String email3) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, email, this.email2, email3, this.mobile, this.work, this.secondary, this.photo, this.home);
    }

    public ContactData withPhoto(String photo) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, this.email2, this.email3, this.mobile, this.work, this.secondary, photo, this.home);
    }

    public ContactData withHome(String home) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, this.email2, this.email3, this.mobile, this.work, this.secondary, this.photo, home);
    }

    public ContactData withMobile(String mobile) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, this.email2, this.email3, mobile, this.work, this.secondary, this.photo, this.home);
    }

    public ContactData withWork(String work) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, this.email2, this.email3, this.mobile, work, this.secondary, this.photo, this.home);
    }

    public ContactData withSecondary(String secondary) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, this.email2, this.email3, this.mobile, this.work, secondary, this.photo, this.home);
    }


}