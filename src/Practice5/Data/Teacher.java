package Practice5.Data;

public class Teacher extends User{
    private String discipline;
    public Teacher(String name, String surname, String dateOfBirth, String discipline) {
        super(name, surname, dateOfBirth);
        this.discipline = discipline;
    }
    public Teacher(){}

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "discipline='" + discipline + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
