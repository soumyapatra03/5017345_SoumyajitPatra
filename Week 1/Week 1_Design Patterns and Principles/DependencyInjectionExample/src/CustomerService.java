// CustomerService.java
public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerById(int id) {
        return customerRepository.findCustomerById(id);
    }
}
