package org.example;
import org.example.models.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Hamburger hamburger = new Hamburger("Basic", "beef", 3.56, "white");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Vegan", 5.67, "brown rye");


        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger("beef", "white");
        deluxeBurger.addHamburgerAddition3("Should not do this", 50.53); // Test override method
        System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemizeHamburger());


    }
}