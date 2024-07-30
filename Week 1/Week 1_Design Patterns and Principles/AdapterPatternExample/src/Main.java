// Main.java
public class Main {
    public static void main(String[] args) {
        // Create instances of the gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters for the gateways
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        // Process payments using the adapters
        payPalAdapter.processPayment(100.0); // Output: Processing payment of $100.0 through PayPal.
        stripeAdapter.processPayment(200.0); // Output: Charging $200.0 using Stripe.
    }
}
