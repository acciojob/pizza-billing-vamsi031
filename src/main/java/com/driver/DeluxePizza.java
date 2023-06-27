package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg) {

        // your code goes here
        super(isVeg);
        super.setExtracheese(80);
        if(isVeg)super.setExtraToppings(70);
        else super.setExtraToppings(120);

    }
}
