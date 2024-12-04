package CoffeeShop;

public class EspressoWithMilk extends CoffeeDecorator {

    public EspressoWithMilk() {
        super(new Espresso());
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
