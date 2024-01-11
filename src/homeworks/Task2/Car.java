package homeworks.Task2;


public class Car extends Vehicle{
    private int fuelCapacity = 50;
    public int currentFuelLevel;

    public int getFuelCapacity()
    {
        return fuelCapacity;
    }

    @Override
    void displayInfo()
    {
        System.out.println(super.id);
        System.out.println(super.brand);
        System.out.println(super.model);
        System.out.println(super.year);
        System.out.println(getFuelCapacity());
        System.out.println(currentFuelLevel);
    }

    @Override
    void startEngine()
    {
        System.out.println("Двигатель запустился");
    }

    @Override
    void stopEngine()
    {
        System.out.println("Двигатель остановился");
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

    void refuel(int liters){
        System.out.println("Заправили автомобиль на " + liters + " литров, теперь топлива в баке " + (liters + currentFuelLevel));
    }
}
