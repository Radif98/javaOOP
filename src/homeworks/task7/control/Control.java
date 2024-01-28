package homeworks.task7.control;

import homeworks.task7.colculatormodel.Addition;
import homeworks.task7.colculatormodel.Division;
import homeworks.task7.colculatormodel.Multiplication;
import homeworks.task7.colculatormodel.Subtraction;
import homeworks.task7.colculatorview.View;

public class Control {
    protected Addition addition = new Addition();
    protected Division division = new Division();
    protected Multiplication multiplication = new Multiplication();
    protected Subtraction subtraction = new Subtraction();
    protected View view = new View();

    public void startWork()
    {
        boolean flag = false;
        while (!flag) {
            try {
                view.start();
                System.out.println();
                double argument1 = view.entersFirstNumbers();
                System.out.println();
                double argument2 = view.entersSecondNumbers();
                String choice = view.getUserChoice();
                switch (choice) {
                    case "+":
                        System.out.println(addition.action(argument1, argument2));
                        break;
                    case "-":
                        System.out.println(division.action(argument1, argument2));
                        break;
                    case "*":
                        System.out.println(multiplication.action(argument1, argument2));
                        break;
                    case "/":
                        System.out.println(subtraction.action(argument1, argument2));
                        break;
                    case "!":
                        flag = true;
                        break;
                    default:
                        System.out.println("Что-то пошло не по плану(((");
                        System.out.println();
                }
            } catch (Exception e) {
                view.error();
                flag = true;
            }
        }
    }
}
