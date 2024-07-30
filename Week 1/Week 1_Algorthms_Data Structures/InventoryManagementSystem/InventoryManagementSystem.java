import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<Integer, Product> inventory;

    // Constructor
    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    // Method to update a product
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found with ID: " + product.getProductId());
        }
    }

    // Method to delete a product
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            Product removedProduct = inventory.remove(productId);
            System.out.println("Product removed: " + removedProduct);
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    // Method to display all products
    public void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }

    // Main method to test the system
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Adding products
        Product product1 = new Product(1, "Laptop", 10, 75000);
        Product product2 = new Product(2, "Smartphone", 20, 30000);
        ims.addProduct(product1);
        ims.addProduct(product2);

        // Displaying products
        ims.displayProducts();

        // Updating a product
        Product updatedProduct1 = new Product(1, "Laptop", 8, 74000);
        ims.updateProduct(updatedProduct1);

        // Displaying products after update
        ims.displayProducts();

        // Deleting a product
        ims.deleteProduct(2);

        // Displaying products after deletion
        ims.displayProducts();
    }
}
