package homeworks.task5;

import java.util.Scanner;

public class StudyGroupView {
    private Scanner scanner;

    public StudyGroupView()
    {
        scanner = new Scanner(System.in);
    }

    public String getUserChoice()
    {
        System.out.println("Привет, давай \"создадим\" учебную группу");
        System.out.print("Ваш выбор: \n" +
                " '+' - создать студентческую группу \n" +
                " '-' - хотите завершить работу \n");

        return scanner.next();
    }

    public String getUserInput(String promt)
    {
        System.out.print(promt +
                " '*' - информация по студентческой группе \n" +
                " '-' - хотите завершить работу \n" +
                " '0' - информация по учителю \n" +
                " '1' - информация по студенту 1 \n" +
                " '2' - информация по студенту 2 \n" +
                " '3' - информация по студенту 3 \n" +
                " '4' - информация по студенту 4 \n" +
                " '5' - информация по студенту 5 \n");
        return scanner.next();
    }


}
