package com.company;

public class Pencil {

    private double leadSize;
    private String brand;
    private boolean hasEraser;
    private boolean isMechanical;
    private String color;

    public double getLeadSize() {
        return leadSize;
    }

    public void setLeadSize(double leadSize) {
        this.leadSize = leadSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasEraser() {
        return hasEraser;
    }

    public void setHasEraser(boolean hasEraser) {
        this.hasEraser = hasEraser;
    }

    public boolean isMechanical() {
        return isMechanical;
    }

    public void setMechanical(boolean mechanical) {
        isMechanical = mechanical;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pencil(double leadSize, String brand, boolean isMechanical, String color) {
        this.leadSize = leadSize;
        this.brand = brand;
        this.isMechanical = isMechanical;
        this.color = color;
        }

    public Pencil(double leadSize, String brand, boolean hasEraser, boolean isMechanical, String color) {
        this.leadSize = leadSize;
        this.brand = brand;
        this.hasEraser = hasEraser;
        this.isMechanical = isMechanical;
        this.color = color;
    }
}
