package Practice5.Data;

public class Student extends User{
    private int studentId;
    public Student(String name, String surname, String dateOfBirth, int studentId) {
        super(name, surname, dateOfBirth);
        this.studentId = studentId;
    }
    public Student(){}

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
