import java.util.ArrayList;

public class Order {
    private ArrayList<Fruit> fruits;
    private double quantityInKg;
    private Buyer buyer;
    private Seller seller;

    public Order(ArrayList<Fruit> fruits, double quantityInKg, Buyer buyer, Seller seller) {
        this.fruits = fruits;
        this.quantityInKg = quantityInKg;
        this.buyer = buyer;
        this.seller = seller;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public double getQuantityInKg() {
        return quantityInKg;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Seller getSeller() {
        return seller;
    }
}
