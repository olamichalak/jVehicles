package com.company;

public class Car extends Vehicle
{

    @Override
    public void StartEngine() {
        //super.StartEngine();
        System.out.println("Engine of the car started");
    }

    public void Drive()
    {
        System.out.println("The vehicle is driving!");
    }

}
