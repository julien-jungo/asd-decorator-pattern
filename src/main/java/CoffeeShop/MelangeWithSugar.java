package CoffeeShop;

public class MelangeWithSugar extends CoffeeDecorator {

    public MelangeWithSugar() {
        super(new Melange());
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
