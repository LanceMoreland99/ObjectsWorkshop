package com.company;
import java.util.Scanner;

public class Vehicle {

    Scanner input = new Scanner(System.in);

    private String make;
    private String model;
    private String color;
    private int year;


    public Vehicle(String make, String model, int year){

        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Vehicle() {

//
        System.out.println("What make is your car?");
            setMake(input.nextLine());
        System.out.println("What model is your car?");
            setModel(input.nextLine());
        System.out.println("What year was your car made?");
            setYear(input.nextInt());
            setColor(input.nextLine());
        System.out.println("What color is your vehicle?");
            setColor(input.nextLine());

        System.out.println(getYear() + " " + getMake() + " " + getModel() + " " +getColor());
    }




}
