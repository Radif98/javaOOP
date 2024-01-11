package homeworks.Task2;

public abstract class Vehicle {
    public int id;
    public String brand;
    public String model;
    public int year;
    abstract void startEngine();
    abstract void stopEngine();
    abstract void accelerate(int speed);
    abstract void brake();
    abstract void displayInfo();
}
