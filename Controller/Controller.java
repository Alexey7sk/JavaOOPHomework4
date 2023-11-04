import java.util.List;

import Modell.Type;
import Service.DataService;
import View.StudentView;
import Modell.Student;
import Modell.User;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
        
    }

    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student)user);
        }
    }
}
