package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world Zia!");
        Sale man = new Sale("Zia", 500);
        Sale women = new Sale("Zia", 500);
        System.out.println(man);
        System.out.println(man.equalDeals(women));

    }

}