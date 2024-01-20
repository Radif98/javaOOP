package seminars.seminar05.task2;

public class ColculatorController {
    private ColculatorModel colculatorModel;
    private ColculatorView colculatorView;

    public ColculatorController(ColculatorModel colculatorModel, ColculatorView colculatorView)
    {
        this.colculatorModel = colculatorModel;
        this.colculatorView = colculatorView;
    }

    public void runCoculator()
    {
        String choice = colculatorView.getUserChoice();
        Double argumentOne = colculatorView.getUserInput("Введите первое число");
        Double argumentTwo = colculatorView.getUserInput("Введите второе число");
        switch (choice) {
            case "+":
                System.out.println(colculatorModel.summa(argumentOne, argumentTwo));
                break;
            case "-":
                System.out.println(colculatorModel.difference(argumentOne, argumentTwo));
                break;
            case "*":
                System.out.println(colculatorModel.multi(argumentOne, argumentTwo));
                break;
            case "/":
                System.out.println(colculatorModel.divide(argumentOne, argumentTwo));
                break;
            default:
                System.out.println("Что-то пошло не по плану(((");

        }

    }

    public static void main(String[] args)
    {
        ColculatorView colculatorView = new ColculatorView();
        ColculatorModel colculatorModel = new ColculatorModel();
        ColculatorController colculatorController = new ColculatorController(colculatorModel, colculatorView);
        colculatorController.runCoculator();

    }

}
