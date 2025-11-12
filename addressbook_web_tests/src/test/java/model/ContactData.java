package model;

public record ContactData(
        String id,
        String firstname,
        String lastname,
        String address,
        String phone,
        String email,
        String photo,
        String home,
        String mobile,
        String work,
        String secondary) {

    public ContactData () {
        this("", "", "", "", "", "", "", "", "", "", "");
    }

    public ContactData withId(String id) {
        return new ContactData( id, firstname, this.lastname, this.address, this.phone, this.email, this.photo, this.home, this.mobile, this.work, this.secondary);
    }

    public ContactData withFirstname(String firstname) {
        return new ContactData( this.id, firstname, this.lastname, this.address, this.phone, this.email, this.photo, this.home, this.mobile, this.work, this.secondary);
    }

    public ContactData withLastname(String lastname) {
        return new ContactData( this.id, this.firstname, lastname, this.address, this.phone, this.email, this.photo, this.home, this.mobile, this.work, this.secondary);
    }

    public ContactData withAddress(String address) {
        return new ContactData( this.id, this.firstname, this.lastname, address, this.phone, this.email, this.photo, this.home, this.mobile, this.work, this.secondary);
    }

    public ContactData withPhone(String phone) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, phone, this.email, this.photo, this.home, this.mobile, this.work, this.secondary);
    }

    public ContactData withEmail(String email) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, email, this.photo, this.home, this.mobile, this.work, this.secondary);
    }

    public ContactData withPhoto(String photo) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, photo, this.home, this.mobile, this.work, this.secondary);
    }

    public ContactData withHome(String photo) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, this.photo, home, this.mobile, this.work, this.secondary);
    }

    public ContactData withMobile(String photo) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, this.photo, this.home, mobile, this.work, this.secondary);
    }

    public ContactData withWork(String photo) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, this.photo, this.home, this.mobile, work, this.secondary);
    }

    public ContactData withSecondary(String photo) {
        return new ContactData( this.id, this.firstname, this.lastname, this.address, this.phone, this.email, this.photo, this.home, this.mobile, this.work, secondary);
    }


}