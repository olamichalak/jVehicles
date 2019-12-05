package com.company;

public class Car extends Vehicle
{

    public Car(String name)
    {
        super(name);
    }

    @Override
    double getFuelNeeds()
    {
        return 100; //zwykly car ma 100l paliwa
    }

    @Override
    double getDistance()
    {
        return 10;
    }
}
