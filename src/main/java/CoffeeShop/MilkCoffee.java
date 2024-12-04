package CoffeeShop;

public class MilkCoffee extends CoffeeDecorator {

    public MilkCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double price() {
        return super.price() + 0.50;
    }

    @Override
    public String description() {
        return super.description() + " with milk";
    }
}
