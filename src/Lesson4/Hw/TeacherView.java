package Lesson4.Hw;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView<T extends Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    public void sendOnConsole(List<Teacher> teacherList){
        for (Teacher user :
                teacherList) {
            logger.info(user.toString());
        }
    }


}
