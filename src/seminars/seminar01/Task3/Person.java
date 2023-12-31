package seminars.seminar01.Task3;

public class Person {
    // Приватное поле, которое мы хотим инкапсулировать
    private int age;

    // Геттер для получения значения поля age
    public int getAge() {
        return age;
    }

    // Сеттер для установки значения поля age
    public void setAge(int age) {
// Можно добавить проверки на корректность значения age здесь
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным.");
        }
    }
}
