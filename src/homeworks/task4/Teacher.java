package homeworks.task4;

import java.util.List;

public abstract class Teacher<T> {
    private T nameTeacher;
    public Teacher(T name) {
        this.nameTeacher = name;
    }

    public T getNameTeacher()
    {
        return nameTeacher;
    }

    public void setNameTeacher(T nameTeacher)
    {
        this.nameTeacher = nameTeacher;
    }

    public static void printList(List<?> list)
    {
        for (Object elem : list) {
            System.out.println(elem); // Вывод каждого элемента списка
        }
    }
}
