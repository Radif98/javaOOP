package seminars.seminar03.task3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printConsumer = System.out::println;
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(printConsumer);
    }
}

