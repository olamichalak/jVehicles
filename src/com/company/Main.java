package com.company;

public class Main {

    public static void main(String[] args)
    {

        Vehicle vehicle = new Vehicle();
        Vehicle plane = new Plane();
        Vehicle car = new Car();
        Vehicle ship = new Ship();
        Vehicle truck = new Truck();
        Vehicle racecar = new RaceCar();
        Vehicle[] vehicles = {vehicle, plane, car, ship, truck, racecar};

        for (Vehicle temp: vehicles)
        {
        if(temp instanceof RaceCar)
        {
            System.out.println("This is a race car: ");
            ((RaceCar)temp).StartEngine();
            ((RaceCar) temp).Boost();
            ((RaceCar) temp).Drive();
        }
        else if(temp instanceof Truck)
        {
            System.out.println("This is a truck: ");
            ((Truck)temp).StartEngine();
            ((Truck) temp).Load();
            ((Truck) temp).Drive();
        }
        else if(temp instanceof Car)
        {
            System.out.println("This is a car: ");
            ((Car)temp).StartEngine();
            ((Car) temp).Drive();
        }
        else if(temp instanceof Plane)
        {
            System.out.println("This is a plane: ");
            ((Plane)temp).StartEngine();
            ((Plane) temp).Fly();
        }
        else if(temp instanceof Ship)
        {
            System.out.println("This is a ship: ");
            ((Ship)temp).StartEngine();
            ((Ship) temp).Swim();
        }
        else
            System.out.println("This is a vehicle: ");
            temp.StartEngine();
        }
    }
}
