package CoffeeShop;

public class Espresso extends Coffee {
    @Override
    public double price() {
        return 1.90;
    }

    @Override
    public String description() {
        return "Fresh and hot Espresso";
    }
}
