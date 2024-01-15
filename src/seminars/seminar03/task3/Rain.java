package seminars.seminar03.task3;

import java.util.function.Predicate;

public class Rain {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println("Is 5 positive? " + isPositive.test(5));
        System.out.println("Is -5 positive? " + isPositive.test(-5));
    }
}
