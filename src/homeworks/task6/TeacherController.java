package homeworks.task6;

public class TeacherController extends Teacher {
   TeacherView teacherView;
   TeacherServis teacherServis;

    public TeacherController(TeacherView teacherView, TeacherServis teacherServis)
    {
        this.teacherView = teacherView;
        this.teacherServis = teacherServis;
    }

    public void startGenerateTeacher() {
        teacherView.Hello();
        String name = teacherView.giveNameTeacher();
        teacherServis.setName(name);
        String lastName = teacherView.giveLastNameTeacher();
        teacherServis.setLastName(lastName);
        teacherServis.initTeacher();
        teacherServis.printTeacher();

    }
}
