public class EmailAlert implements Observer {
    private String emailId;

    public EmailAlert(String emailId) {
        this.emailId = emailId;
    }

    public void update(String stockName, double price) {
        System.out.println("Email sent to " + emailId + ": " + stockName + " price is Rs." + price);
    }
}
