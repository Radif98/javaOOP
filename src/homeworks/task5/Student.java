package homeworks.task5;

import java.util.LinkedList;
import java.util.List;

public class Student extends Participant implements GenerateList{
    public String status = "студент";
    public List student = new LinkedList();

    public Student(Integer id, String name, String lastName)
    {
        super(id, name, lastName);

    }


    @Override
    public void generateParticipant()
    {
        student.add(id);
        student.add(name);
        student.add(lastName);
        student.add(status);
    }
    public void infoStudent()
    {
        for (Object info : student) {
            System.out.println("* " + info);
        }
    }
}
