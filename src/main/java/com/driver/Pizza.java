package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extracheese;

    private int extraToppings;

    private int bagPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price=300;

    }

    public Pizza(int price, Boolean isVeg, String bill) {
        this.price = price;
        this.isVeg = isVeg;
        this.bill = bill;
    }

    public Pizza() {

    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.extracheese+=80;

    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg)this.extraToppings+=70;
        else this.extraToppings+=120;
    }

    public void addTakeaway(){
        // your code goes here
        this.bagPrice+=20;
    }

    public String getBill(){
        // your code goes here
        return "Base Price Of The Pizza:"+this.price+"\n"+
                "Extra Cheese Added:"+this.extracheese+"\n"+
                "Extra Toppings Added:"+this.extraToppings+"\n"+
                "Paperbag Added:"+this.bagPrice+
                "\n"+"Total Price:"+(this.price+this.extracheese+this.extraToppings+this.bagPrice)+"\n";

    }
}
