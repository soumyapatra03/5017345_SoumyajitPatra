// Main.java
public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp1 = new MobileApp("Mobile App 1");
        Observer mobileApp2 = new MobileApp("Mobile App 2");
        Observer webApp1 = new WebApp("Web App 1");

        // Register observers
        stockMarket.register(mobileApp1);
        stockMarket.register(mobileApp2);
        stockMarket.register(webApp1);

        // Change stock price
        stockMarket.setPrice(100.0);

        // Deregister an observer
        stockMarket.deregister(mobileApp2);

        // Change stock price again
        stockMarket.setPrice(120.0);
    }
}
