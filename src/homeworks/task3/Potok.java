package homeworks.task3;

import java.util.*;

public class Potok implements Iterable {
        private List<StudentGroup> studenGroup;

    public Potok()
    {
        this.studenGroup = new ArrayList<>();
    }

    public void add(StudentGroup group) {
        studenGroup.add(group);
    }


    @Override
    public Iterator<StudentGroup> iterator()
    {
        return studenGroup.iterator();
    }
}
