
public class Sawwood extends Wood implements Volume{
    private double width,thickness;

    public Sawwood(double width,double thickness,double length) {
        super(length);
        this.width=width;
        this.thickness=thickness;
    }

    @Override
    public double calculate_volume() {
        double result=width*thickness*0.0833333* getLength();
        return result;
    }
}
