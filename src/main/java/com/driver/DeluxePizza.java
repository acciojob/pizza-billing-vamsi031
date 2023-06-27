package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg) {

        // your code goes here
        super();

        if(isVeg)super.setPrice(450);
        else super.setPrice(600);

    }
}
