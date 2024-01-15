package homeworks.task4;

public class TeacherView<T> extends Teacher implements Editor {

    public TeacherView(Object name)
    {
        super(name);
    }

    @Override
    public Object editorTeacher(Object teacher)
    {
        StringBuilder stringBuilder = new StringBuilder(teacher.toString());
        return stringBuilder.reverse();
    }
}
