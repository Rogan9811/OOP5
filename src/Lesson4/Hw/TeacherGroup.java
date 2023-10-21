package Lesson4.Hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teachers;

    public List<Teacher> getAll() {
        return teachers;
    }

    public TeacherGroup() {
        this.teachers = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void remove(Teacher teacher) {
        for (Teacher l :
                teachers) {
            if (l.getId() == teacher.getId()) teachers.remove(l);
        }
    }

    public void updateTeacher(Teacher teacher) {
        for (Teacher l :
                teachers) {
            if (l.getId() == teacher.getId()) {
                l.setName(teacher.getName());
                l.setSurname(teacher.getSurname());
                l.setPatronymic(teacher.getPatronymic());
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "TeacherGroup" +
                "teachers: " + teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return teachers.iterator();
    }
}
