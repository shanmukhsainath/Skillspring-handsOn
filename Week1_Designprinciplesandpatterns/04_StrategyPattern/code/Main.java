public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234567812345678", "Meena"));
        paymentContext.makePayment(1200);

        paymentContext.setPaymentStrategy(new UPIPayment("meena@upi"));
        paymentContext.makePayment(650);
    }
}
