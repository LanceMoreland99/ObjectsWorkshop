package com.company;

public class Vehicle {


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
}
