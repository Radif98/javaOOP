package homeworks.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random random = new Random();
        Car car = new Car();
        car.id = random.nextInt(1000);
        car.brand = "BMW";
        car.model = "M5";
        car.year = 2012;
        car.currentFuelLevel = random.nextInt(30);
        car.displayInfo();
        car.startEngine();
        car.accelerate(random.nextInt(10));
        car.brake();
        car.stopEngine();
        car.refuel(random.nextInt(10));

        System.out.println("-------------");

        Aircraft aircraft = new Aircraft();
        aircraft.id = random.nextInt(1000);
        aircraft.brand = "Boeing";
        aircraft.model = "777";
        aircraft.year = 2002;
        aircraft.displayInfo();
        aircraft.startEngine();
        aircraft.accelerate(random.nextInt(600));
        System.out.println(aircraft.isFlying());
        aircraft.takeOff();
        System.out.println(aircraft.isFlying());
        aircraft.land();
        System.out.println(aircraft.isFlying());
        aircraft.brake();
        aircraft.stopEngine();

        System.out.println("-------------");

        Boat boat = new Boat();
        boat.id = random.nextInt(1000);
        boat.brand = "Лайнер";
        boat.model = "Титаник";
        boat.year = 1912;
        boat.displayInfo();
        boat.startEngine();
        boat.startSwimming();
        boat.accelerate(random.nextInt(20));
        System.out.println(boat.isSailing());
        boat.stopSwimming();
        System.out.println(boat.isSailing());
        boat.brake();
        boat.stopEngine();





    }
}
