import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Fruit f1=new Fruit("Apple", "Red", 10.0, 2.5);
        Fruit f2=new Fruit("Banana", "Yellow", 20.0, 1.5);
        Fruit f3=new Fruit("Orange", "Citrus", 15.0, 3.0);

        ArrayList<Fruit> fruits=new ArrayList<>();
        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);

        Seller seller = new Seller("John", "Doe", "1234567890", "123 Main St",fruits);

        Buyer buyer = new Buyer("Jane", "Smith", "9876543210", "456 Elm St",5);

        Delivery delivery = new Delivery(new RoutePlanner() {
            @Override
            public String calculateRoute(String address1, String address2) {
                return "Route A";
            }
        });

        try {
            Order order = buyer.placeOrder(seller);
            delivery.deliver(order);
        } catch (NoFruitsException e) {
            System.out.println(e.getMessage());
        }
    }
}