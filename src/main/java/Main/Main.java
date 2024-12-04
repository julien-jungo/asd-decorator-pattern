package Main;

import CoffeeShop.*;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println(espresso.description() + ": €" + espresso.price());

        Coffee melange = new Melange();
        System.out.println(melange.description() + ": €" + melange.price());

        Coffee espressoWithMilk = new Milk(espresso);
        System.out.println(espressoWithMilk.description() + ": €" + espressoWithMilk.price());

        Coffee espressoWithMilkAndMilk = new Milk(espressoWithMilk);
        System.out.println(espressoWithMilkAndMilk.description() + ": €" + espressoWithMilkAndMilk.price());

        Coffee espressoDoubleMilkAndSugar = new Sugar(espressoWithMilkAndMilk);
        System.out.println(espressoDoubleMilkAndSugar.description() + ": €" + espressoDoubleMilkAndSugar.price());




        ////
        Coffee melangeWithSugar = new Sugar(melange);
        System.out.println(melangeWithSugar.description() + ": €" + melangeWithSugar.price());

        //TODO: Add two new Coffees: Espresso with Milk and Melange with Sugar. Make use of the DecoraterPattern.
    }
}
