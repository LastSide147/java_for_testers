package model;

public record ContactData(String firstname, String lastname, String address, String phone, String email) {

    public ContactData (){
        this("", "", "", "", "");
    }
}