package homeworks.task7.colculatorview;

import java.util.Scanner;

public class View implements IEntersNumbers{

    protected Scanner scanner;
    public View()
    {
        this.scanner = new Scanner(System.in);
    }


    public void start() {
        System.out.println("Привестивую тебя дорогой, друг!");
    }


    @Override
    public Double entersFirstNumbers()
    {
        System.out.println("Введите первое число");
        return scanner.nextDouble();
    }

    @Override
    public Double entersSecondNumbers()
    {
        System.out.println("Введите второе число");
        return scanner.nextDouble();
    }


    @Override
    public void error()
    {
        IEntersNumbers.super.error();
    }

    public String getUserChoice()
    {
        System.out.print("Ваше действие над числами: \n" +
                " '!' - завершить работу \n" +
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
