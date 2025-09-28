import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupRemovalTest extends TestBase {

      @Test
    public void CanRemoveGroup() {
          openGroupsPage();
          if (!isGroupPresent()) {
            createGroup(new GroupData("group name", "group header", "group footer"));
        }
          removeGroup();
      }

}
