package Lesson4.Hw;

public class Teacher {
    private String name;
    private String surname;
    private String patronymic;
    private int id;

    public Teacher(String name, String surname, String patronymic, int id) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "Teacher " + id + " " +
                name + " " +
                surname+ " " +
                patronymic;
    }
}
