package com.company;

public class RaceCar extends Car
{

    public RaceCar(String name)
    {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 150; //sportowe auto ma 150l paliwa
    }
}
