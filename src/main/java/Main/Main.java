package Main;

import CoffeeShop.*;

public class Main {
  public static void main(String[] args) {
    Coffee espresso = new Espresso();
    System.out.println(espresso.description() + ": €" + espresso.price());

    Coffee melange = new Melange();
    System.out.println(melange.description() + ": €" + melange.price());

    //TODO: Add two new Coffees: Espresso with Milk and Melange with Sugar. Make use of the DecoraterPattern.

    Coffee milkEspresso = new MilkCoffeeDecorator(espresso);
    System.out.println(milkEspresso.description() + ": €" + milkEspresso.price());

    Coffee sugarMelange = new SugarCoffeDecorator(melange);
    System.out.println(sugarMelange.description() + ": €" + sugarMelange.price());
  }
}
