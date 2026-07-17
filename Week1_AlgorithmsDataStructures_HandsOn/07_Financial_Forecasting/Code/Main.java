public class Main {
    public static void main(String[] args) {
        ForecastCalculator calculator = new ForecastCalculator();

        double currentValue = 10000;
        double growthRate = 0.08;
        int years = 3;

        double recursiveValue = calculator.calculateFutureValue(currentValue, growthRate, years);
        double iterativeValue = calculator.calculateFutureValueIterative(currentValue, growthRate, years);

        System.out.println("Future value using recursion: Rs." + recursiveValue);
        System.out.println("Future value using loop: Rs." + iterativeValue);
    }
}
