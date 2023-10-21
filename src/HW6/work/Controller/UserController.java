package HW6.work.Controller;

import HW6.work.Data.User;
import HW6.work.Data.UserInterface;

public class UserController<T extends UserInterface> {
    private T user;
    public void loadStudent(T student){
        this.user = student;
    }

    public void createStudent(String name, String surname, String patronymic){
        this.user = (T) new User(name, surname, patronymic);
    }
    public void changeName(String name, String lName, String pName){
        this.user.setName(name);
        this.user.setSurname(lName);
        this.user.setPatronymic(pName);
    }

    public T getUser() {
        return user;
    }
}
