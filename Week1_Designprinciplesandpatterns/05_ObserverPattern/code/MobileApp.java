public class MobileApp implements Observer {
    private String userName;

    public MobileApp(String userName) {
        this.userName = userName;
    }

    public void update(String stockName, double price) {
        System.out.println(userName + " received update: " + stockName + " is Rs." + price);
    }
}
