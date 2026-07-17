public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String holderName;

    public CreditCardPayment(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }

    public void pay(double amount) {
        System.out.println(holderName + " paid Rs." + amount);
        System.out.println("Payment done using card ending with " + cardNumber.substring(12));
    }
}
