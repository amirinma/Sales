package org.example;

import javax.sound.midi.SysexMessage;

public class Sale {
    private String name; // a none emepty string
    private double price; // non negative
    public Sale(){
        name = "No name yet";
        price = 0;
    }
    public Sale(String theName, double thePrice){
        setName(theName);
        setPrice(thePrice);
    }

    public Sale(Sale originalObject){
        if(originalObject == null){
            System.out.println("Error: null sale object.");
            System.exit(0);
        } else {
            name = originalObject.name;
            price = originalObject.price;
        }
    }

    public static void announcement(){
        System.out.println("This is the sale class.");
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        if(newPrice >=0){
            price = newPrice;
        } else  {
            System.out.println(" Fatal error.");
            System.exit(0);
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        if (newName != null && newName != ""){
            name = newName;
        } else {
            System.out.println("Error: improper name value.");
            System.exit(0);
        }
    }
    public String toString(){
        return (name + " Price and total cost = $" + price);
    }
    public double bill(){
        return price;
    }
    public boolean equalDeals(Sale otherSale){
        if (otherSale == null){
            return false;
        }else {
           return (name.equals(otherSale.name) && bill()==otherSale.bill());
        }
    }
}
