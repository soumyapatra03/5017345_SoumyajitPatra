public class FinancialForecasting {

    /**
     * Recursive method to calculate the future value of an investment.
     *
     * @param principal    The initial amount of money invested.
     * @param growthRate   The annual growth rate (as a decimal, e.g., 0.05 for 5%).
     * @param years        The number of years the money is invested.
     * @return             The future value of the investment after the specified number of years.
     */
    public static double calculateFutureValue(double principal, double growthRate, int years) {
        // Base case: If years is 0, return the principal itself
        if (years == 0) {
            return principal;
        }
        // Recursive case: Calculate future value for one year less
        return calculateFutureValue(principal * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double principal = 1000.0; // Initial amount
        double growthRate = 0.05; // Growth rate (5%)
        int years = 10; // Number of years

        // Calculate future value
        double futureValue = calculateFutureValue(principal, growthRate, years);
        System.out.printf("The future value after %d years is: %.2f%n", years, futureValue);
    }
}
