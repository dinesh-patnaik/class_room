package com.scaler;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World");
	    Bird hen1 = new Hen("hen1", 13, "BLACK");

        Seller seller = new Seller();

        Bird flamingo1 = new Flamingo("flamingo1", 13, "BLACK");
        Bird eagle1 = new Eagle("eagle1", 13, "BLACK");

        hen1.fly();
        seller.sell(hen1);

        flamingo1.fly();
        seller.sell(flamingo1);

        eagle1.fly();
        seller.sell(eagle1);

        TV tv1 = new LCD("Sony", "s1",32,"black");
        seller.sell(tv1);
    }
}
