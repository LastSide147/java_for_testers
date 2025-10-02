package model;

public record ContactData(String firstname, String lastname, String address, String phone, String email) {

    public ContactData (){
        this("", "", "", "", "");
    }

//    public ContactData withFirstname(String firstname) {
//        return new ContactData(firstname, this.lastname);
//    }
//
//    public ContactData withLastname(String lastname) {
//        return new ContactData(this.firstname, lastname);
//    }
}