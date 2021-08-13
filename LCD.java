package com.august11;

public class LCD extends TV{
    LCD(String brand, String modelName, double width, String color){
        this.brand = brand;
        this.modelName = modelName;
        this.width = width;
        this.color = color;
    }
    @Override
    public double getSellingPrice() {
        return 10000;
    }
}
