package seminars.seminar01.task2;

public class Main {
    public static void main(String[] args) {
// Создаем объекты классов Animal и Dog
        Animal animal = new Animal("Животное");
        Dog dog = new Dog("Барсик");

// Вызываем методы makeSound для каждого объекта
        animal.makeSound();
        dog.makeSound();
    }
}
