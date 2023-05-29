import java.util.ArrayList;

public class Seller extends User {
    private String address;
    private ArrayList<Fruit> fruits;

    public Seller(String firstName, String lastName, String phoneNumber, String address,ArrayList<Fruit>fruits) {
        super(firstName, lastName, phoneNumber);
        this.address = address;
        this.fruits = fruits;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

//    public void addFruit(Fruit fruit) {
//        fruits.add(fruit);
//    }
}
