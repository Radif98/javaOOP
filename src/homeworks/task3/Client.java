package homeworks.task3;

import java.util.Collections;
import java.util.Comparator;

public class Client {
    static StudentGroup goup1 = new StudentGroup("first", 1);
    static StudentGroup goup2 = new StudentGroup("second", 2);
    static StudentGroup goup3 = new StudentGroup("third", 3);
    static Potok potok = new Potok();
    public static void main(String[] args)
    {
        potok.add(goup1);
        potok.add(goup2);
        potok.add(goup3);

        Comparator numberComparator = new StreamComparator();
        Collections.sort(potok, numberComparator);

        for (StudentGroup group: potok) {
            System.out.println(group.toString());
        }
    }
}
