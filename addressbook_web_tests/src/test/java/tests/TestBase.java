package tests;

import manager.ApplicationManager;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    protected static ApplicationManager app;

    @BeforeEach
    public void setUp() {
        if (app == null) {
            app = new ApplicationManager();
        }
        app.init("firefox");
    }
//        if (ApplicationManager.driver == null) {
//            ApplicationManager.driver = new FirefoxDriver();
//            Runtime.getRuntime().addShutdownHook(new Thread(ApplicationManager.driver::quit));
//            ApplicationManager.driver.get("http://localhost/addressbook/");
//            ApplicationManager.driver.manage().window().setSize(new Dimension(850, 694));
//            ApplicationManager.driver.findElement(By.name("user")).sendKeys("admin");
//            ApplicationManager.driver.findElement(By.name("pass")).sendKeys("secret");
//            ApplicationManager.driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
//        }
//    }
}
