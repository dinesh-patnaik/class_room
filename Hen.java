package com.scaler;

public class Hen extends Bird{
    Hen(String name, double weight, String color){
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
    @Override
    void fly() {
        System.out.println("Flying hen");
    }

    @Override
    public double getSellingPrice() {
        if(color == "BLACK"){
            return  2000;
        }
        return 250;
    }
}
