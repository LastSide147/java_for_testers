package ru.stqa.mantis.manager;

import org.openqa.selenium.os.ExternalProcess;
import ru.stqa.mantis.common.CommonFunctions;

import java.time.Duration;

public class JamesCliHelper extends HelperBase{

     public JamesCliHelper(ApplicationManager manager) {
         super(manager);
     }

     public void addUser(String email, String password) throws InterruptedException {
         ExternalProcess.builder()
                 .command("java",
                         "-cp",
                         "\"james-server-jpa-app.lib/*\"",
                         "org.apache.james.cli.ServerCmd",
                         "--host", "127.0.0.1",
                         "--port", "9999",
                         "AddUser", email, password)
//                 .directory("D:/james-server-jpa-guice/james-server-jpa-guice")
                 .directory(manager.property("james.workingDir"))
                 .copyOutputTo(System.err)
                 .start()
                 .waitFor(Duration.ofHours(1));
     }
}
