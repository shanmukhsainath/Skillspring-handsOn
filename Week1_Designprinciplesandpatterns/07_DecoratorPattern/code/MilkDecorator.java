public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", milk";
    }

    public double getCost() {
        return coffee.getCost() + 10;
    }
}
