public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " costs Rs." + coffee.getCost());

        // New features are added without changing SimpleCoffee.
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription() + " costs Rs." + coffee.getCost());
    }
}
