package seminars.seminar05.task2;

import java.util.Scanner;

public class ColculatorView {
    private Scanner scanner;

    public ColculatorView()
    {
        scanner = new Scanner(System.in);
    }

    public String getUserChoice()
    {
        System.out.print("Ваш выбор: \n" +
                " '+' - плюс \n" +
                " '-' - минус \n" +
                " '*' - уножение \n" +
                " '/' - делеание \n");
        return scanner.next();
    }

    public Double getUserInput(String promt)
    {
        System.out.print(promt + ": ");
        return scanner.nextDouble();
    }
}
