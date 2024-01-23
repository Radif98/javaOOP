package homeworks.task6;

public class Main {
    public static void main(String[] args)
    {
        TeacherServis teacherServis = new TeacherServis();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherView, teacherServis);
        teacherController.startGenerateTeacher();
    }
}
