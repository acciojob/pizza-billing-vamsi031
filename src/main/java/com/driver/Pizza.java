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
        if(isVeg){
            this.price=300;
        }else this.price=400;

    }

    public Pizza(int price, Boolean isVeg, String bill) {
        this.price = price;
        this.isVeg = isVeg;
        this.bill = bill;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public int getExtracheese() {
        return extracheese;
    }

    public void setExtracheese(int extracheese) {
        this.extracheese = extracheese;
    }

    public int getExtraToppings() {
        return extraToppings;
    }

    public void setExtraToppings(int extraToppings) {
        this.extraToppings = extraToppings;
    }

    public int getBagPrice() {
        return bagPrice;
    }

    public void setBagPrice(int bagPrice) {
        this.bagPrice = bagPrice;
    }

    public Pizza() {

    }




    public void addExtraCheese(){
        // your code goes here
        this.extracheese=80;

    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isVeg)this.extraToppings=70;
        else this.extraToppings=120;
    }

    public void addTakeaway(){
        // your code goes here
        this.bagPrice=20;
    }

    public String getBill(){
        // your code goes here
//        return "Base Price Of The Pizza: "+this.price+"\n"+
//                "Extra Cheese Added: "+this.extracheese+"\n"+
//                "Extra Toppings Added: "+this.extraToppings+"\n"+
//                "Paperbag Added: "+this.bagPrice+
//                "\n"+"Total Price: "+(this.price+this.extracheese+this.extraToppings+this.bagPrice)+"\n";

        String str="Base Price Of The Pizza: "+this.price+"\n";

        if(this.extracheese>0){
            str+="Extra Cheese Added: "+this.extracheese+"\n";
        }
        if(this.extraToppings>0){
            str+="Extra Toppings Added: "+this.extraToppings+"\n";
        }
        if(this.bagPrice>0){
            str+="Paperbag Added: "+this.bagPrice+"\n";
        }
        return str+="Total Price: "+(this.price+this.extracheese+this.extraToppings+this.bagPrice)+"\n";


    }


}
