public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        // Strategy can be changed at runtime.
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method first.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
