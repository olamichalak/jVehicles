package com.company;

public class Plane extends Vehicle
{

    @Override
    public void StartEngine() {
        //super.StartEngine();
        System.out.println("Engine of the plane started");
    }

    public void Fly()
    {
        System.out.println("The vehicle is flying!");
    }
}
