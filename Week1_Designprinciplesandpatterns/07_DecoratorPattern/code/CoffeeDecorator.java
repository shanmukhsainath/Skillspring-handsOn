public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        // Decorator keeps a reference to the original object.
        this.coffee = coffee;
    }
}
