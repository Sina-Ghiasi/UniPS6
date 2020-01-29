package com.sinaCompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Hi ;)");
        System.out.println("Choose Car :1-bmw 2-benz 3-ferrari 4-porsche");
        Car car = CarFactory.getCar(Integer.parseInt((in.nextLine())));
            car.information();
        }
    }

