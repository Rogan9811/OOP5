package Lesson4.work;

 public class User {
    private String name;
    private String surname;
    private String patronymic;

    public User(String name, String surname, String patronomyc){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronomyc;
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
        return name +
                surname
                + patronymic;
    }
}
