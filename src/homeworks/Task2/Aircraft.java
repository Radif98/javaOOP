package homeworks.Task2;



public class Aircraft extends Vehicle implements Flyable{
    private int maxAltitude = 13140;
    private boolean isFlying = false;

    public boolean isFlying()
    {
        return isFlying;
    }

    public int getMaxAltitude()
    {
        return maxAltitude;
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
        System.out.println(getMaxAltitude());
        System.out.println(isFlying);
    }

    @Override
    public void takeOff()
    {
        System.out.println("Взлет");
        isFlying = true;
    }

    @Override
    public void land()
    {
        System.out.println("Посадка");
        isFlying = false;
    }


}
