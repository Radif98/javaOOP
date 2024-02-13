package exception.seminars.seminar03.task01;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args)
    {
        doSomething();
    }
    public static void doSomething() {
        throw new RuntimeException();
    }
}
