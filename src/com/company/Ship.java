package com.company;

public class Ship extends Vehicle implements Sailing
{

    public Ship(String name)
    {
        super(name);
    }

    @Override
    public void dock()
    {
        System.out.println("Przybyłeś do portu!");
    }

    @Override
    double getFuelNeeds()
    {
        return 1000; //statek ma 1000l paliwa
    }

    @Override
    double getDistance()
    {
        return 40; //przeplywa 40km
    }

    @Override
    public void stop()
    {
        dock();
    }
}
