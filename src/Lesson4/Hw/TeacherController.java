package Lesson4.Hw;

import java.util.Scanner;

public class TeacherController<T extends Teacher> {
    private TeacherGroup teachers;
    private TeacherService teacherService;
    private TeacherView teacherView = new TeacherView();

    public TeacherController(TeacherGroup teachers, TeacherService teacherService) {
        this.teachers = teachers;
        this.teacherService = teacherService;
    }

    public void addNewTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name - ");
        String name = scanner.next();
        System.out.println("surname - ");
        String surname = scanner.next();
        System.out.println("patronymic - ");
        String patronymic = scanner.next();

        int id = teachers.getTeachers().size() + 1;

        Teacher teacher = new Teacher(name, surname, patronymic, id);
        if (!teacherService.validateTeacher(teacher)) return;

        teachers.addTeacher(teacher);
        System.out.println(teachers);
        teacherView.sendOnConsole(teachers.getAll());
    }

    public void removeTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter teacher's id for removing ...");
        int id = Integer.parseInt(scanner.next());

        for (Teacher l :
                teachers) {
            if (l.getId() == id) {
                teachers.remove(l);
                System.out.println(teachers);
                return;
            }
        }
        System.out.println("This id is incorrect! Please, try again.");
    }

    public void refactorTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter teacher's id for refactoring ...");
        int id = Integer.parseInt(scanner.next());

        for (Teacher l :
                teachers) {
            if (l.getId() == id) {
//                teachers.remove(l);
                System.out.println("Name - ");
                String name = scanner.next();
                System.out.println("surname - ");
                String surname = scanner.next();
                System.out.println("patronymic - ");
                String patronymic = scanner.next();

                Teacher teacher = new Teacher(name, surname, patronymic, id);
                if (!teacherService.validateTeacher(teacher)) return;

                teachers.updateTeacher(teacher);
                System.out.println(teachers);
                teacherView.sendOnConsole(teachers.getAll());
                return;
            }
        }
    }
}
