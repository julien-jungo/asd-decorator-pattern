package CoffeeShop;

public class SugarCoffeDecorator extends CoffeeDecorator {

  public SugarCoffeDecorator(Coffee coffee) {
    super(coffee);
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
