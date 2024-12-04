package CoffeeShop;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double price() {
        return super.price() + 1.00;
    }

    @Override
    public String description() {
        return super.description() +  " with Milk";
    }
}
