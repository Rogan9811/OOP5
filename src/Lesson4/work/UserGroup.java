package Lesson4.work;

import java.util.List;

public class UserGroup<T extends User>{
    private String nameGroup;
    private List<T> group;

    public UserGroup(String nameGroup, List<T> group) {
        this.nameGroup = nameGroup;
        this.group = group;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public List<T> getGroup() {
        return group;
    }

    public void addStudent(T user){
        group.add(user);
    }
    public void removeStudent(T user){
        group.remove(user);
    }
}
