import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private String stockName;
    private double price;
    private List<Observer> observers;

    public StockMarket(String stockName) {
        this.stockName = stockName;
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(double price) {
        // Whenever price changes, all observers are notified.
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}
