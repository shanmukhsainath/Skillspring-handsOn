public interface Observer {
    // Observers receive the latest value from the subject.
    void update(String stockName, double price);
}
