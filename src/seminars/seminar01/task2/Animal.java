package seminars.seminar01.task2;

public class Animal {
    // Поле класса
    protected String name;

    // Конструктор класса
    public Animal(String name) {
        this.name = name;
    }

    // Метод класса для издания звука
    public void makeSound() {
        System.out.println("Звук животного");
    }
}