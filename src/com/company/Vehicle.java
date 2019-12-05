package com.company;

public abstract class Vehicle
{

    private String name;

    public Vehicle(String name)
    {
        this.name = name;
    }

    abstract double getFuelNeeds();
    abstract double getDistance();

    public double calculateFuelConsumption()
    {
        return getFuelNeeds()/getDistance();
    }

    public void go()
    {
        System.out.println(name + " jedzie");
    }

    public void stop()
    {
        System.out.println(name + " zatrzymuje się");
    }
}
