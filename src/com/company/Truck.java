package com.company;

public class Truck extends Car
{

    public Truck(String name)
    {
        super(name);
    }

    @Override
    double getFuelNeeds()
    {
        return 500; //truck ma 500l paliwa
    }
}
