package Practice5.View;

import Practice5.Controller.Controller1;
import Practice5.Data.Group;

public class View {
    Controller1 controller = new Controller1();
    public void createGroup(Group group){
        controller.addGroup(group);
    }

    public void addStudent(int groupId, String name, String surname, String dateOfBirth, int studentId){
        controller.addStudent(groupId ,name, surname, dateOfBirth, studentId);
    }

    public void printInfo(){
        System.out.println(controller.toString());
    }
}