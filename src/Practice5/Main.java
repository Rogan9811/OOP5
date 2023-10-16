package Practice5;

import Practice5.Data.Group;
import Practice5.Data.Student;
import Practice5.Data.Teacher;
import Practice5.View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Student student = new Student("a", "ba", "ca", 1);
        Student student1 = new Student("aa", "baa", "caa", 2);
        Student student2 = new Student("aaa", "bb", "cb", 3);
        Student student3 = new Student("ab", "bbb", "cbb", 4);
        Student student4 = new Student("abb", "bc", "cc", 5);
//        Student student5 = new Student("ac", "bcc", "ccc", 6);
        view.createGroup(new Group(new ArrayList<>(List.of(student, student1, student2, student3, student4)),
                new Teacher("Kaban", "Kabanov",
                "080605", "Infa"), 1));

        view.addStudent(1,"ac", "bcc", "ccc", 6);
        view.printInfo();
    }
}
