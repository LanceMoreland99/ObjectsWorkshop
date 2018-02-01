package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Cat cat = new Cat(4,true, "Golden");

//        System.out.println(cat.getColor());

        Vehicle vehicle = new Vehicle();

//
        System.out.println("What make is your car?");
            String setMake = input.nextLine();
        System.out.println("What model is your car?");
            String setModel = input.nextLine();
        System.out.println("What year was your car made?");
            String setYear = input.nextLine();

        System.out.println(vehicle.getYear() + " " + vehicle.getMake() + vehicle.getModel() + vehicle.getColor());

    }
}
