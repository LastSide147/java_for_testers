package ru.stqa.mantis.model;

public record UserData(String username, String realName, String email) {

    public UserData() {
        this("", "", "");
    }

    public UserData WithUsername(String username) {
        return new UserData(username, this.realName(), this.email());
    }

    public UserData WithRealName(String realName) {
        return new UserData(this.username(), realName, this.email());
    }

    public UserData WithEmail(String email) {
        return new UserData(this.username(), this.realName(), email);
    }
}
