public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(201, "Anu", 4500),
                new Order(202, "Bala", 1200),
                new Order(203, "Charan", 7800),
                new Order(204, "Divya", 3200)
        };

        OrderSorter sorter = new OrderSorter();
        sorter.quickSort(orders, 0, orders.length - 1);

        System.out.println("Orders sorted by total price:");
        for (int i = 0; i < orders.length; i++) {
            orders[i].displayOrder();
        }
    }
}
