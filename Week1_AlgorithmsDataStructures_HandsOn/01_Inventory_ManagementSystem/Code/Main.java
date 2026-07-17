public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Keyboard", 15, 899));
        manager.addProduct(new Product(102, "Mouse", 25, 499));

        System.out.println("Current inventory:");
        manager.displayProducts();

        manager.updateProduct(102, 30, 549);
        manager.deleteProduct(101);

        System.out.println("Inventory after changes:");
        manager.displayProducts();
    }
}
