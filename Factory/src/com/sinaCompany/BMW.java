package com.sinaCompany;

public class BMW implements Car {
    int fullSpeed =200;
    int weight =1500;
    double acceleration =3.5;
    @Override
    public void information() {
        System.out.println("bmw");
        System.out.println("fullSpeed :"+fullSpeed);
        System.out.println("weight :"+weight);
        System.out.println("acceleration :"+acceleration);
    }
}
