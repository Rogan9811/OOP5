package Lesson4;


import Lesson4.Hw.TeacherController;
import Lesson4.Hw.TeacherGroup;
import Lesson4.Hw.TeacherService;
import Lesson4.work.User;
import Lesson4.work.UserComparator;
import Lesson4.work.UserGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// Создать класс Юзер и перенести его в базовые поля (ФИО)
//         - Модифицировать ранее созданный класс СтудентКомпаратор
//         - Переименовать в ЮзерКомпаратор
//         - Типизировать его T наследующегося от типа Юзер
//         - Типизировать реализуемый интерфейс Компаратор T
//         - Изменить метод компаре, внеся во входные данные вместо конкретных классов типизацию T
//         - Внести правки места, где использовался предыдущий компаратор
// ------------------------------------------------------------------------
//-- Создать класс Учитель
//        -- Создать класс УчительСервис ;(добавляем валидацию)     x
//        — Создать класс УчительВью;(Выводим в консоль)
//        — Создать класс УчительКонтроллер(Работа с данными: принимает данные в класс Учитель и отправляет в Учитель вью) и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.
//        -- Создать класс ГруппаУчителей
//        --Добавить поле учитель в учебную группу

public class Main {
    public static void main(String[] args) {
//        List<User> userList = new ArrayList<>();
//        UserGroup<User> userGroup = new UserGroup<>("fGroup", userList);
//
//        User student1 = new User("Aleksey", "Cheropahov", "Ashotovich");
//        User student2 = new User("OLeg", "Orehov", "Alekseevich");
//        User student3 = new User("Churban", "Pashtetov", "Akakievich");
//
//        userGroup.addStudent(student2);
//        userGroup.addStudent(student3);
//        userGroup.addStudent(student1);
//
//        UserComparator<User> userComparator = new UserComparator();
//        TreeSet<User> sortedGroup = new TreeSet<>(userComparator);
//        for (User l: userGroup.getGroup()){
//            System.out.println(l);
//            sortedGroup.add(l);
//        }
//        System.out.println("--".repeat(10));
//        System.out.println(sortedGroup);
//        for (User l :
//                userGroup.getGroup()) {
//            sortedGroup.comparator().compare();
//        }

        // ------------------------------------------------------------- //
        TeacherGroup teachers = new TeacherGroup();
        TeacherService teacherService = new TeacherService<>();

        TeacherController teacherController = new TeacherController<>(teachers, teacherService);
        teacherController.addNewTeacher();
        teacherController.addNewTeacher();
        teacherController.addNewTeacher();

        teacherController.refactorTeacher();
        teacherController.removeTeacher();
    }
}
