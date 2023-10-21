package HW6.work.Controller;

import HW6.work.Data.StudentGroup;
import HW6.work.Data.UserInterface;
import Practice5.Data.User;

import java.util.ArrayList;

public class GroupController<T extends User & UserInterface> {
    private StudentGroup<T> group;
    public void createGroup(String groupName) {
        this.group = new StudentGroup<>(groupName);
    }

    public void initializeStudents(ArrayList<T> students){
        this.group.setGroup(students);
    }

    public void loadGroup(StudentGroup<T> group){
        this.group = group;
    }

    public void addStudentToGroup(T student) {
        group.addStudent(student);
    }

    public void removeStudentFromGroup(T student) {
        group.removeStudent(student);
    }


    public StudentGroup<T> getGroup() {
        return group;
    }
}