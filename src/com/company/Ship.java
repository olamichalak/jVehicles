package com.company;

public class Ship extends Vehicle
{

    @Override
    public void StartEngine() {
        //super.StartEngine();
        System.out.println("Engine of the ship started");
    }

    public void Swim()
    {
        System.out.println("The vehicle is swimming!");
    }

}
