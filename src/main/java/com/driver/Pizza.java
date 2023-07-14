package com.driver;

public class Pizza {

    public int base;
    private int price;

    private Boolean isVeg;
    private String bill;

    private boolean CheeseAdded = false;

    private boolean ToppingsAdded = false;

    private boolean ChooseTakeAway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
        }else this.price=400;
        this.base=this.price;

    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void addExtraCheese(){
        if(CheeseAdded) return;
        CheeseAdded = true;
        this.price +=  80;
    }

    public void addExtraToppings(){
        // your code goes here
        if (ToppingsAdded) return;
        ToppingsAdded = true;
        if (isVeg) this.price += 70;
        else if(!isVeg) this.price += 120;

    }

    public void addTakeaway(){
        // your code goes here
        if (ChooseTakeAway) return;
        ChooseTakeAway = true;
        this.price += 20;
    }

    public String getBill(){

        this.bill = "Base Price Of The Pizza: "+base +"\n";
        if(base == 300 || base == 400) {
            if (CheeseAdded) {
                this.bill += "Extra Cheese Added: 80\n";
            }
            if (ToppingsAdded) {
                if (isVeg) {
                    this.bill += "Extra Toppings Added: 70\n";
                } else {
                    this.bill += "Extra Toppings Added: 120\n";
                }
            }
        }
        if (ChooseTakeAway){
            this.bill += "Paperbag Added: 20\n";
        }
        this.bill += "Total Price: " + this.price+ "\n";
        return this.bill;
    }






}
