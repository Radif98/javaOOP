package homeworks.Task2;

public class Boat extends Vehicle implements Swimmable{

    private int maxSpeed = 42;
    private boolean  isSailing = false;

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public boolean isSailing()
    {
        return isSailing;
    }

    @Override
    public void startSwimming()
    {
        System.out.println("Начало движения по воде");
        isSailing = true;
    }

    @Override
    public void stopSwimming()
    {
        System.out.println("Прекращения дижения по воде");
        isSailing = false;
    }

    @Override
    void startEngine()
    {
        System.out.println("Запуск двигателя");
    }

    @Override
    void stopEngine()
    {
        System.out.println("Остановка двигателя");
    }

    @Override
    void accelerate(int speed)
    {
        System.out.println("Скорость увеличалось на велечину " + speed);
    }

    @Override
    void brake()
    {
        System.out.println("Прекращение движения");
    }

    @Override
    void displayInfo()
    {
        System.out.println(super.id);
        System.out.println(super.brand);
        System.out.println(super.model);
        System.out.println(super.year);
        System.out.println(getMaxSpeed());
        System.out.println(isSailing());
    }
}
