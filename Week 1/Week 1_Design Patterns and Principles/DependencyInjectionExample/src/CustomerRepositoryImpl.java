// CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulating a customer lookup
        if (id == 1) {
            return "Customer 1: John Doe";
        } else if (id == 2) {
            return "Customer 2: Jane Smith";
        } else {
            return "Customer not found";
        }
    }
}
