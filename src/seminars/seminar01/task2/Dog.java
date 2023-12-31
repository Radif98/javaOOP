package seminars.seminar01.task2;

public class Dog extends Animal {
    // Конструктор подкласса
    public Dog(String name) {
        super(name);
    }

    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }
}