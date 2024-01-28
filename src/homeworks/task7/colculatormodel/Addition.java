package homeworks.task7.colculatormodel;

public class Addition extends Action {
    @Override
    public Double action(Double firstElement, Double secondElement)
    {
        return firstElement + secondElement;
    }
}
