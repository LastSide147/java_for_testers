package ru.stqa.mantis.model;

public record MailMessages(String from, String content) {

    public MailMessages() {
        this("", "");
    }

    public MailMessages withFrom(String from) {
        return new MailMessages(from, this.content);
    }

    public MailMessages withContent(String content) {
        return new MailMessages(this.from, content);
    }
}

