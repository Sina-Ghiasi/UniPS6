package com.sinaCompany;

public class Benz implements Car {
    int fullSpeed =240;
    int weight =1600;
    double acceleration = 3.5;
    @Override
    public void information() {
        System.out.println("benz");
        System.out.println("fullSpeed :"+fullSpeed);
        System.out.println("weight :"+weight);
        System.out.println("acceleration :"+acceleration);
    }
}
