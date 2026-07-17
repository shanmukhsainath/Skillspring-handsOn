public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Camera", "Electronics"),
                new Product(102, "Headphones", "Electronics"),
                new Product(103, "Laptop", "Computers"),
                new Product(104, "Shoes", "Fashion")
        };

        SearchService searchService = new SearchService();

        Product firstResult = searchService.linearSearch(products, "Laptop");
        Product secondResult = searchService.binarySearch(products, "Shoes");

        System.out.println("Linear search result:");
        firstResult.displayProduct();

        System.out.println("Binary search result:");
        secondResult.displayProduct();
    }
}
