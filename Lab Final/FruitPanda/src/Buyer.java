import java.util.ArrayList;
import java.util.Scanner;

public class Buyer extends User{
    private String address;
    private int rewards;
    private Order order;

    public Buyer(String firstName, String lastName, String phoneNumber, String address, int rewards) {
        super(firstName, lastName, phoneNumber);
        this.address = address;
        this.rewards = rewards;
    }

    public String getAddress() {
        return address;
    }

    public int getRewards() {
        return rewards;
    }

    public void setRewards(int rewards) {
        this.rewards = rewards;
    }

    public Order getOrder() {
        return order;
    }

    Order placeOrder(Seller seller)throws NoFruitsException{
        ArrayList<Fruit>sellerFruits=seller.getFruits();

        System.out.println("Available fruits from " + seller.getFirstName() + ":");
        for(Fruit fruit:sellerFruits){
            System.out.println("Fruit: " + fruit.getName() + ", Variety: " + fruit.getVariety() +", Price per kg: " + fruit.getPricePerKg());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the fruit to buy: ");
        String fruitName = scanner.nextLine();
        System.out.print("Enter the quantity in kg: ");
        double quantityInKg = scanner.nextDouble();

        Fruit chosenFruit=null;
        for(Fruit fruit:sellerFruits){
            if(fruit.getName().equalsIgnoreCase(fruitName)){
                chosenFruit=fruit;
                break;
            }
        }

        if (chosenFruit == null || chosenFruit.getTotalQuantityKg() == 0) {
            throw new NoFruitsException();
        }

        ArrayList<Fruit> orderFruits = new ArrayList<>();
        orderFruits.add(chosenFruit);

        order = new Order(orderFruits, quantityInKg, this, seller);

        return order;

    }
}
