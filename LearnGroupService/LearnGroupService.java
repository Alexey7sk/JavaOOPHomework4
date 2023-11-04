import java.util.ArrayList;
import java.util.List;

import Modell.Student;
import Modell.Teacher;
import Modell.User;
import Modell.Type;

public class LearnGroupService {
    Student student;
    Teacher teacher;
    List<Student> listGroup = new ArrayList<>();
    public void addPeoples(User user){
        if(user instanceof Type.TEACHER){
            listGroup.add(new Teacher(null, null, null, 0));
        }
        if(user instanceof Type.STUDENT){
            listGroup.add(new Student(null, null, null, 0));
        }
    }
}
