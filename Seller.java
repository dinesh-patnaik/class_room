package com.scaler;

public class Seller {
    void sell(Sellable s){
        System.out.println("Sold at "+ s.getSellingPrice());
    }
}
