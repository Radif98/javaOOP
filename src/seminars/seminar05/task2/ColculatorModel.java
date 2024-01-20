package seminars.seminar05.task2;

public class ColculatorModel {
    private Double resalt;

    public Double summa(double argumentOne, double argumentTwo)
    {
        resalt = argumentOne + argumentTwo;
        return resalt;
    }

    public Double difference(double argumentOne, double argumentTwo)
    {
        resalt = argumentOne - argumentTwo;
        return resalt;
    }

    public Double multi(double argumentOne, double argumentTwo)
    {
        resalt = argumentOne * argumentTwo;
        return resalt;
    }

    public Double divide(double argumentOne, double argumentTwo)
    {
        resalt = argumentOne / argumentTwo;
        return resalt;
    }
}
