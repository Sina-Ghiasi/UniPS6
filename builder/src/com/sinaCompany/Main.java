package com.sinaCompany;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Name :");
        String name=in.nextLine();
        System.out.println("family name :");
        String familiName=in.nextLine();
        System.out.println("user :");
        String user =in.nextLine();
        System.out.println("person code :");
        int personCode=Integer.parseInt(in.nextLine());
        System.out.println("id :");
        int id=Integer.parseInt(in.nextLine());
        System.out.println("age :");
        int age = Integer.parseInt(in.nextLine());

        Person p = new Person.Builder()

                .setname(name)

                .setfamilyname(familiName)

                .setuser(user)

                .atRate(age)

                .build();


        System.out.println(p.getName()+" "+p.getFamilyName());

    }

}
