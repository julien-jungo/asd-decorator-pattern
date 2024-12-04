package CoffeeShop;

// This decorator-class can be used to extend the coffee-functionality without touching the coffee-class
abstract class CoffeeDecorator extends Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public double price() {
        return decoratedCoffee.price();
    }

    public String description() {
        return decoratedCoffee.description();
    }
}

// TODO: Create Milk and Sugar types, using the Decorator Pattern (extending CoffeeDecorator)
// TODO: Make use of the "super()" keyword and make sure that Milk and Sugar adjust the pricing as well as the description (e.g. adding " (With Milk)")