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
