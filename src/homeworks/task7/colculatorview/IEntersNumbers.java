package homeworks.task7.colculatorview;

public interface IEntersNumbers {
    Double entersFirstNumbers();
    Double entersSecondNumbers();

    default void error() {
        System.out.println("Упс, введите строго число");
    }
}
