package com.sinaCompany;

public class Porsche implements Car {
    int fullSpeed =270;
    int weight =1950;
    double acceleration =3.4;
    @Override
    public void information() {
        System.out.println("porsche");
        System.out.println("fullSpeed :"+fullSpeed);
        System.out.println("weight :"+weight);
        System.out.println("acceleration :"+acceleration);
    }
}
