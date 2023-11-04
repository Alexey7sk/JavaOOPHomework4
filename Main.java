import Controller.Controller;

public class main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("aaa", "aaa", "aaa");
        controller.createStudent("bbb", "bbb", "bbb");
        controller.createStudent("ccc", "ccc", "ccc");
        controller.getAllStudent();
    }
}
