import java.util.Arrays;

public class SearchAlgorithms {
    
    public static Product linearSearch(Product[] products, int searchId) {
        for (Product product : products) {
            if (product.getProductId() == searchId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int searchId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].getProductId() == searchId) {
                return products[mid];
            } else if (products[mid].getProductId() < searchId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

