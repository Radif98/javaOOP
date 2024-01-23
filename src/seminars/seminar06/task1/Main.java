package seminars.seminar06.task1;

public class Main {
    public static void main(String[] args)
    {
        Journal journal = new Journal();
        journal.addEntry("Hi");
        journal.addEntry("Bye");
        Printer.print(journal);
    }
}
