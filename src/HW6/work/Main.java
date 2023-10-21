package HW6.work;

import HW6.work.Controller.GroupController;
import HW6.work.Data.User;
import HW6.work.Data.UserComparator;
import HW6.work.Data.UserInterface;
import HW6.work.View.View;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        GroupController<User> groupController = new GroupController<>();
        //ArrayList<UserInterface> students = new ArrayList<>();
        //StudentGroup<UserInterface> group1 = new StudentGroup<>("Group1", students);

        User student1 = new User("Aleksandr", "Pushkin", "Sergeevitch");
        User student2 = new User("Mikhail", "Lermontov", "Yurievich");
        User student3 = new User("Aleksandr", "Griboedov", "Sergeevitch");

//        UserInterface student1 = new User("Aleksandr", "Pushkin", "Sergeevitch");
//        UserInterface student2 = new User("Mikhail", "Lermontov", "Yurievich");
//        UserInterface student3 = new User("Aleksandr", "Griboedov", "Sergeevitch");

        groupController.createGroup("IT");
        groupController.addStudentToGroup(student1);
        groupController.addStudentToGroup(student2);
        groupController.addStudentToGroup(student3);
//        group1.addStudent(student1);
//        group1.addStudent(student2);
//        group1.addStudent(student3);

        UserComparator<UserInterface> comparator = new UserComparator<>();
        TreeSet<UserInterface> sortedGroup = new TreeSet<>(comparator);

        for (User user : groupController.getGroup().getGroup()
        ) {
            sortedGroup.add(user);
        }
        System.out.println(sortedGroup);

        View view = new View(groupController);
        view.showStudents();
    }
}
