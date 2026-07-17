public class ForecastCalculator {
    public double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Recursive method calculates value year by year.
        if (years == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public double calculateFutureValueIterative(double currentValue, double growthRate, int years) {
        double futureValue = currentValue;

        for (int i = 1; i <= years; i++) {
            futureValue = futureValue * (1 + growthRate);
        }
        return futureValue;
    }
}
