import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import Modell.Student;
import Modell.Teacher;
import Modell.User;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    private int getFreeId(Type type){
        int lastId = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent){
                lastId = ((Teacher)user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent){
                lastId = ((Student)user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getFreeId(type);
        if(type == Type.STUDENT){
            Student student = new Student(firstName, secondName, lastName, id);
            userList.add(student);
        }
        if(type == Type.TEACHER){
            Teacher teacher = new Teacher(firstName, secondName, lastName, id);
            userList.add(teacher);
        }
    }

    public List<User> getAllStudent(){
        List<User> studentList = new ArrayList<>();
        for (User user : studentList) {
            if(user instanceof Student){
                studentList.add(user);
            }
        }
        return studentList;
    }
}
