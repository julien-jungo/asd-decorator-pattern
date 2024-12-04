package CoffeeShop;

public class Melange extends Coffee {
    @Override
    public double price() {
        return 3.00;
    }

    @Override
    public String description() {
        return "Finest Melange";
    }
}