import java.util.ArrayList;

public class Delivery {
    private RoutePlanner routePlanner;

    public Delivery(RoutePlanner routePlanner) {
        this.routePlanner = routePlanner;
    }

    public void deliver(Order order) {
        String route = routePlanner.calculateRoute(order.getSeller().getAddress(), order.getBuyer().getAddress());
        System.out.println("Delivering the order via route: " + route);

        ArrayList<Fruit> fruits = order.getFruits();
        double quantity = order.getQuantityInKg();

        for (Fruit fruit : fruits) {
            fruit.setTotalQuantityKg(fruit.getTotalQuantityKg() - quantity);
        }

        double moneySpent = quantity * fruits.get(0).getPricePerKg();
        Buyer buyer = order.getBuyer();
        buyer.setRewards((int) (buyer.getRewards() + (0.01 * moneySpent)));
    }
}
