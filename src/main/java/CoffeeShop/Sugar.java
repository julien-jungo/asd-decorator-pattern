package CoffeeShop;

public class Sugar extends CoffeeDecorator{

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double price() {
        return super.price() + 0.40;
    }

    @Override
    public String description() {
        return super.description() +  " with Sugar";
    }
}
