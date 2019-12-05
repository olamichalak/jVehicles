package com.company;

public class Plane extends Vehicle implements Flying
{

    public Plane(String name)
    {
        super(name);
    }

    @Override
    public void takeOff()
    {
        System.out.println("Samolot startuje");
    }

    @Override
    public void land()
    {
        System.out.println("Samolot ląduje");
    }

    @Override
    public void callAirControl()
    {
        System.out.println("Samolot dzwoni do kontroli lotów");
    }

    @Override
    double getFuelNeeds()
    {
        return 20000; //samolot ma 20000l paliwa
    }

    @Override
    double getDistance()
    {
        return 20; //200km
    }

    @Override
    public void go() {
        takeOff();
    }

    @Override
    public void stop() {
        land();
    }
}
