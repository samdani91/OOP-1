public class Fruit {

    private String name;
    private String variety;
    private double totalQuantityKg;
    private double pricePerKg;

    public Fruit(String name, String variety, double totalQuantityKg, double pricePerKg) {
        this.name = name;
        this.variety = variety;
        this.totalQuantityKg = totalQuantityKg;
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }

    public String getVariety() {
        return variety;
    }

    public double getTotalQuantityKg() {
        return totalQuantityKg;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setTotalQuantityKg(double totalQuantityKg) {
        this.totalQuantityKg = totalQuantityKg;
    }
}
