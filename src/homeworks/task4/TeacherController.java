package homeworks.task4;

import java.util.LinkedList;
import java.util.List;

public class TeacherController {
    public static void main(String[] args)
    {
        List<String> listTeacher = new LinkedList<>();
        TeacherService<String> teacherServise = new TeacherService<>("УчительСервис");
        System.out.println(teacherServise.getNameTeacher());
        Object editorTeacherServise = teacherServise.editorTeacher(teacherServise.getNameTeacher());
        System.out.println(editorTeacherServise);
        listTeacher.add(teacherServise.getNameTeacher().toString());
        TeacherView<String> teacherView = new TeacherView<>("УчительВидИмеет");
        System.out.println(teacherView.getNameTeacher());
        Object editorTeacherView = teacherView.editorTeacher(teacherView.getNameTeacher());
        System.out.println(editorTeacherView);
        listTeacher.add(teacherView.getNameTeacher().toString());
        Teacher.printList(listTeacher);

    }
}
