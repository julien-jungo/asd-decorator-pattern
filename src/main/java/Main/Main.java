package Main;

import CoffeeShop.*;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println(espresso.description() + ": €" + espresso.price());

        Coffee melange = new Melange();
        System.out.println(melange.description() + ": €" + melange.price());

        //TODO: Add two new Coffees: Espresso with Milk and Melange with Sugar. Make use of the DecoraterPattern.
    }
}
