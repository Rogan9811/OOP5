package Practice5.Controller;

import Practice5.Data.Group;
import Practice5.Data.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller1 {
    private static List<Group> stream = new ArrayList<>();

    public void addGroup(Group group){
        stream.add(group);
    }

    public static List<Group> getStream() {
        return stream;
    }

    public static void setStream(List<Group> stream) {
        Controller1.stream = stream;
    }

    public static Group getGroupById(int id){
        for (Group l:
             stream) {
            if(l.getId()==id) return l;
        }
        System.out.println("Group is not find.");
        return null;
    }
    public void addStudent(int id, String name, String surname, String dateOfBirth, int studentId){
        getGroupById(id).addStudent(new Student(name,surname,dateOfBirth,studentId));
    }
    public void addTeacher(int id, String name, String surname, String dateOfBirth, String discipline){
        getGroupById(id).createTeacher(name,surname,dateOfBirth,discipline);
    }


    @Override
    public String toString() {
        return "Controller{ " +
                "stream=" + stream +
                "}";
    }
}
