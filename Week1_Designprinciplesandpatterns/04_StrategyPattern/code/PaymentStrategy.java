public interface PaymentStrategy {
    // Different payment modes will implement this same method.
    void pay(double amount);
}
