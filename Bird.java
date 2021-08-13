package com.august11;

abstract class Bird implements Sellable{
    String name;
    double weight;
    String color;
    abstract void fly(); //force to implement it in child class
}
