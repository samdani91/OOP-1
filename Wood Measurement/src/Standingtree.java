public class Standingtree extends Wood implements Volume{

    public Standingtree(double length) {
        super(length);
    }

    @Override
    public double calculate_volume() {
        return 0;
    }
}
