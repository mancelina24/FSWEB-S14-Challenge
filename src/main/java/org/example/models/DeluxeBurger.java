package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String chips;
    private String drink;

    public DeluxeBurger(String meat, String breadRollType) {
        super("Deluxe", meat, 19.10, breadRollType);
        chips = "CURVY";
        drink = "COKE";
    }

    public DeluxeBurger() {
        super("Deluxe Burger","Double",19.10,"Double Sandwich");
        this.chips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("\nDeluxe Burger için ekstralar:");
        System.out.println("Added Chips " + " for an extra 0"); // Deluxe burger already includes chips and drink, so price is already included
        System.out.println("Added Drink " + " for an extra 0");
        return super.itemizeHamburger();

    }
}
