package homeworks.task3;

import java.util.LinkedList;
import java.util.List;

public class StudentGroup {
    public String name;
    public Integer number;
    private List studentGroup;

    public StudentGroup(String name, Integer number)
    {
        this.name = name;
        this.number = number;
        studentGroup = new LinkedList();
        studentGroup.add(this.number);
        studentGroup.add(this.name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

    @Override
    public String toString()
    {
        return "название группы: " + name + " номер группы: " + number;
    }
}
