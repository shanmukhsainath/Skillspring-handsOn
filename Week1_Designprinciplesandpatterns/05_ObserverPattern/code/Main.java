public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("Cognizant");

        Observer mobileApp = new MobileApp("Ravi");
        Observer emailAlert = new EmailAlert("ravi@example.com");

        // Both observers will get updates from the same subject.
        stockMarket.addObserver(mobileApp);
        stockMarket.addObserver(emailAlert);
        stockMarket.setPrice(4120.50);
    }
}
