package ru.stqa.mantis.model;

public record IssueData(String summary, String description, Long project, Long category) {

    public IssueData() {
        this("", "", 0L, 1L);
    }

    public IssueData WithSummary(String summary) {
        return new IssueData(summary, this.description(), this.project(), this.category());
    }

    public IssueData WithDescription(String description) {
        return new IssueData(this.summary, description, this.project(), this.category());
    }

    public IssueData WithProject(Long project) {
        return new IssueData(this.summary, this.description(), project, this.category());
    }

    public IssueData WithCategory(Long category) {
        return new IssueData(this.summary, this.description(), this.project(), category);
    }
}


