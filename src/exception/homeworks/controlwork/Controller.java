package exception.homeworks.controlwork;

import java.util.List;

public class Controller {
    protected Model model; //создаем переменную модель, для работы с методами класса модель
    protected View view; //создаем переменную вид, для работы с методами класса вид

    public Controller() // конструктор для создаения объектов
    {
        this.model = new Model();
        this.view = new View();
    }

    public List<String> creatList() {
        String family = view.getUserInput("введите фамилию: ");
        boolean flag0 = model.isOnlyDigits(family);
        if (flag0) {
            throw new RuntimeException("Некорректная фамилия");
        }
        model.isOnlyChar(family, "некорректная фамилия");
        model.getListData().add(family.toUpperCase());

        String name = view.getUserInput("введите имя: ");
        boolean flag1 = model.isOnlyDigits(name);
        if (flag1) {
            throw new RuntimeException("Некорректное имя");
        }
        model.isOnlyChar(name, "некорректное имя");
        model.getListData().add(name.toUpperCase());

        String surname = view.getUserInput("введите отчество: ");
        boolean flag2 = model.isOnlyDigits(surname);
        if (flag2) {
            throw new RuntimeException("Некорректное отчество");
        }
        model.isOnlyChar(surname, "некорректное отчество");
        model.getListData().add(surname.toUpperCase());

        String birthday = view.getUserInput("введите датурождения формата dd.mm.yyyy: ");
        boolean flag3 = model.isOnlyDigitBirthday(surname);
        if (birthday.length() == 10 && !flag3) {
            throw new RuntimeException("Некорректное дата рождения");
        }
        model.isOnlyCharBirthday(birthday, "некорректная дата рождения");
        model.getListData().add(birthday);

        String numberPhone = view.getUserInput("введите номертелефона: 8");
        boolean flag4 = model.isOnlyDigits(numberPhone);
        if (numberPhone.length() == 11 && !flag4) {
            throw new RuntimeException("Некорректный номер телефона");
        }
        model.getListData().add(numberPhone);

        String gender = view.getUserInput("введите ваш пол f-мужской, m-женский: ");
        boolean flag5 = model.isOnlyDigits(gender);
        if (flag5 && gender.length() == 1) {
            throw new RuntimeException("Некорректный пол");
        }
        model.isOnlyChar(gender, "некорректный пол");
        model.getListData().add(gender);
        return model.getListData();
    }
}
