package exception.seminars.seminar03.task01;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        try(Task2Counter counter = new Task2Counter()) {
            System.out.println(counter.add());
            counter.add();
            counter.add();
            counter.add();
            System.out.println(counter.add());
            System.out.println(counter.add());
            System.out.println(counter.add());
            counter.close();
            counter.add();
            counter.add();
            counter.add();
            System.out.println(counter.add());
        }catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
