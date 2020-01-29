package com.sinaCompany;

public class Ferary implements Car {
    int fullSpeed =280;
    int weight =1800;
    double acceleration =3.2;
    @Override
    public void information() {
        System.out.println("Ferrary");
        System.out.println("fullSpeed :"+fullSpeed);
        System.out.println("weight :"+weight);
        System.out.println("acceleration :"+acceleration);
    }
}
