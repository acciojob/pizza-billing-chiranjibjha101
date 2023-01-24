package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean addExtraCheese=false;
    private boolean addExtraToppings =false;
    private boolean addTakeaway=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){price=300;bill="Base Price Of The Pizza:300\n";}
        else{
            price=400;
            bill="Base Price Of The Pizza:400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addExtraCheese) {
            price += 80;
            bill+="Extra Cheese Added: 80\n";
            addExtraCheese=true;
        }

    }

    public void addExtraToppings(){
        if(!addExtraToppings && isVeg){
            bill+="Extra Toppings Added: 70\n";
            price+=70;
            addExtraToppings=true;
        }
        else if (!addExtraToppings && !isVeg) {
            if(!addExtraToppings && isVeg){
                bill+="Extra Toppings Added: 120\n";
                price+=120;
                addExtraToppings=true;
            }
        }
    }

    public void addTakeaway(){
        if(!addTakeaway){
            bill+="Paperbag Added: 20\n";
            addTakeaway=true;
            price+=20;
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAddExtraCheese(boolean addExtraCheese) {
        this.addExtraCheese = addExtraCheese;
    }

    public String getBill(){
        // your code goes here
        bill+="Total Price: "+price;
        return this.bill;
    }
}
