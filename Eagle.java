package com.scaler;

public class Eagle extends Bird{
    Eagle(String name, double weight, String color){
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    @Override
    void fly() {
        System.out.println("Flying very high eagle");
    }

    @Override
    public double getSellingPrice() {
        return 500;
    }
}
