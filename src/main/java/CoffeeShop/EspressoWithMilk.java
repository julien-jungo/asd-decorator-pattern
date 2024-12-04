package CoffeeShop;

public class EspressoWithMilk extends CoffeeDecorator {

    public EspressoWithMilk(Coffee coffee) {
        super(coffee);
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
