package ru.stqa.mantis.test;

import org.junit.jupiter.api.Test;
import ru.stqa.mantis.common.CommonFunctions;
import ru.stqa.mantis.model.IssueData;

public class IssueCreationsTests extends TestBase {

    @Test
    void canCreateIssue() {
        app.rest().createIssue(new IssueData()
                .WithSummary(CommonFunctions.randomString(10))
                .WithDescription(CommonFunctions.randomString(10))
                .WithProject(1L));
    }
}
