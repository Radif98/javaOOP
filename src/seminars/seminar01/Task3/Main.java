package seminars.seminar01.Task3;

public class Main {
    public static void main(String[] args) {
// Создаем объект класса Person
        Person person = new Person();

// Устанавливаем возраст с использованием сеттера
        person.setAge(30);

// Получаем возраст с использованием геттера и выводим на экран
        System.out.println("Возраст: " + person.getAge());

// Попытка установить отрицательный возраст
        person.setAge(-5); // Выведет сообщение об ошибке
    }
}
