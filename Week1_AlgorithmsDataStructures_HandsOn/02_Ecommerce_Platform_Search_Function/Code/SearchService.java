public class SearchService {
    public Product linearSearch(Product[] products, String productName) {
        // Linear search checks every product one by one.
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equalsIgnoreCase(productName)) {
                return products[i];
            }
        }
        return null;
    }

    public Product binarySearch(Product[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        // Binary search works only when data is sorted by product name.
        while (left <= right) {
            int middle = (left + right) / 2;
            int result = products[middle].getProductName().compareToIgnoreCase(productName);

            if (result == 0) {
                return products[middle];
            } else if (result < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return null;
    }
}
