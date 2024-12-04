package Main;

import CoffeeShop.*;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println(espresso.description() + ": €" + espresso.price());

        Coffee melange = new Melange();
        System.out.println(melange.description() + ": €" + melange.price());

        Coffee espressoWithMilk = new MilkCoffee(new Espresso());
        System.out.println(espressoWithMilk.description() + ": €" + espressoWithMilk.price());

        Coffee melangeWithSugar = new SugarCoffee(new Melange());
        System.out.println(melangeWithSugar.description() + ": €" + melangeWithSugar.price());
    }
}
