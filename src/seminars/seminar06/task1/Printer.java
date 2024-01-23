package seminars.seminar06.task1;

public class Printer {
    public static void print(Journal journal) {
        for (String entry: journal.getEntrise()) {
            System.out.println(entry);
        }
    }
}
