package Lesson4.Hw;

public class TeacherService<T extends Teacher> {
    public TeacherService(){}
    public boolean validateTeacher(Teacher teacher){
        if(teacher.getName().isEmpty()){
            System.out.println("Name is empty. Please enter the name..");
            return false;
        } else if (teacher.getSurname().isEmpty()) {
            System.out.println("Surname is empty. Please enter the surname..");
            return false;
        } else if (teacher.getPatronymic().isEmpty()) {
            System.out.println("Patronymic is empty. Please enter the patronymic..");
            return false;
        } return true;
    }
}
