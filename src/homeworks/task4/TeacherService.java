package homeworks.task4;

public class TeacherService<T> extends Teacher implements Editor {

    public TeacherService(Object name)
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
