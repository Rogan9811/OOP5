package HW6.work.View;

import HW6.work.Controller.GroupController;
import HW6.work.Data.User;

public class View {
    private GroupController<User> groupController = new GroupController<>();

    public View(GroupController<User> groupController) {
        this.groupController = groupController;
    }

    public void showStudents() {
        String show = "Группа " + groupController.getGroup().getNameGroup() +
                ":\n" + "\nCтуденты: \n";
        for (User user : groupController.getGroup().getGroup()
        ) {
            show += "\t\t" + user + "\n";
        }
        System.out.println(show);
    }
}
