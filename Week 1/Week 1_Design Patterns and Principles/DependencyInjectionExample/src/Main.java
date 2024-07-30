// Main.java
public class Main {
    public static void main(String[] args) {
        // Create an instance of the concrete repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Test the service
        System.out.println(customerService.getCustomerById(1)); // Output: Customer 1: John Doe
        System.out.println(customerService.getCustomerById(2)); // Output: Customer 2: Jane Smith
        System.out.println(customerService.getCustomerById(3)); // Output: Customer not found
    }
}
