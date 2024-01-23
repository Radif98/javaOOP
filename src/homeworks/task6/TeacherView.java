package homeworks.task6;

import java.util.Scanner;

public class TeacherView {
    private Scanner scanner;// тут уж комментарий не требуется

    /**
     * конструктор сканера
     */
    public TeacherView()
    {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Приветствие пользователя
     */
    public void Hello() {
        System.out.println("Привет дуржок - пирожок!!!");
    }

    /**
     * ползователь задает имя учителю
     * @return
     */
    public String giveNameTeacher() {
        System.out.println("Дайте имя учителю: ");
        return scanner.next();
    }

    /**
     * пользователь задает фамилию учителю
     * @return
     */
    public String giveLastNameTeacher() {
        System.out.println("Дайте фамилию учителю: ");
        return scanner.next();
    }
}
