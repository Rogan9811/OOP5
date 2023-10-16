package Practice5.Data;

import java.util.List;

public class Group {
    private int id;
    private List<Student> studentList;
    private Student student = new Student();
    private Teacher teacher = new Teacher();

    public Group(List<Student> studentList, Teacher teacher, int id) {
        this.studentList = studentList;
        this.id = id;
        this.teacher = teacher;
    }

    public Group(){}


    public void createStudent(String name, String surname, String dateOfBirth, int studentId){
        student.setStudentId(studentId);
        student.setName(name);
        student.setSurname(surname);
        student.setDateOfBirth(dateOfBirth);
        studentList.add(student);
    }
    public void createTeacher(String name, String surname, String dateOfBirth, String discipline){
        teacher.setDiscipline(discipline);
        teacher.setName(name);
        teacher.setSurname(surname);
        teacher.setDateOfBirth(dateOfBirth);
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void addTeacher(Teacher teacher){

    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id group=" + id +
                ", studentList=" + studentList +
                ", teacher=" + teacher +
                '}';
    }
}
