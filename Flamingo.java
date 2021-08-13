package com.august11;

public class Flamingo extends Bird{
    Flamingo(String name, double weight, String color){
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    @Override
    void fly() {
        System.out.println("Flying Flamingo across continents");
    }

    @Override
    public double getSellingPrice() {
        return 5000;
    }
}
