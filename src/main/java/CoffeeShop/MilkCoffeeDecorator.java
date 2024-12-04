package CoffeeShop;

public class MilkCoffeeDecorator extends CoffeeDecorator {

  public MilkCoffeeDecorator(Coffee coffee) {
    super(coffee);
  }

  @Override
  public double price() {
    return super.price() + 0.40;
  }

  @Override
  public String description() {
    return super.description() + " with Milk";
  }

}
