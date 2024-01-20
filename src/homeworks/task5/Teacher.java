package homeworks.task5;

import jdk.jshell.Snippet;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Participant implements GenerateList{
    public String status = "учитель";
    public List teacher = new LinkedList();
    public Teacher(Integer id, String name, String lastName)
    {
        super(id, name, lastName);
    }


    @Override
    public void generateParticipant()
    {
        teacher.add(id);
        teacher.add(name);
        teacher.add(lastName);
        teacher.add(status);
    }

    public void infoTeacher()
    {
        for (Object info : teacher) {
            System.out.println("* " + info);
        }
    }
}
