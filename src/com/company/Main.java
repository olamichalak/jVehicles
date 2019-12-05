package com.company;

public class Main {

    public static void main(String[] args)
    {

        //Vehicle vehicle = new Vehicle(); //juz nie mozna, bo ta klasa jest abstract

        Vehicle plane = new Plane("Samolot");
        Vehicle car = new Car("Samochód");
        Vehicle ship = new Ship("Statek");
        Vehicle truck = new Truck("Ciężarówka");
        Vehicle racecar = new RaceCar("Auto wyścigowe");
        Vehicle[] vehicles = {plane, car, ship, truck, racecar};

        for (Vehicle temp: vehicles)
        {
            System.out.println();
            temp.go();
            if (temp instanceof Flying)
                ((Flying) temp).callAirControl();
            temp.stop();
            System.out.println("Zużycie paliwa: " + temp.calculateFuelConsumption());
        }
    }
}
