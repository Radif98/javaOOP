package exception.homeworks.controlwork;

import java.util.List;
import java.util.Scanner;

public class View { // класс для работы с юзером
    protected Scanner scanner;

    public View()
    {
        this.scanner = new Scanner(System.in);// создаем сканер, понятно для чего он нужен
    }
    protected String getUserInput(String promt) { // метод для сообщения пользователю, что ему нужно вводить
        System.out.print(promt);
        return scanner.next();
    }


}
