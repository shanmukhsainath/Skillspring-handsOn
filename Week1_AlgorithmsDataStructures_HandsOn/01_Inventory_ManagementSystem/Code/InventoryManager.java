import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> products;

    public InventoryManager() {
        products = new HashMap<Integer, Product>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added successfully.");
    }

    public void updateProduct(int productId, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (products.remove(productId) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            product.displayProduct();
        }
    }
}
