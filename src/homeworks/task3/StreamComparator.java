package homeworks.task3;

import homeworks.task5.Student;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {
    @Override
    public int compare(StudentGroup o1, StudentGroup o2)
    {
        return o1.getNumber() - o2.getNumber();
    }
}

