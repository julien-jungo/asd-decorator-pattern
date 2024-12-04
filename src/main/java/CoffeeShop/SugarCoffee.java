package CoffeeShop;

public class SugarCoffee extends CoffeeDecorator {

    public SugarCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double price() {
        return super.price() + 0.50;
    }

    @Override
    public String description() {
        return super.description() + " with sugar";
    }
}
