public class Roundwood extends Wood implements Volume{
    private double girth;
    Roundwood(Double girth,int length){
        super(length);
        this.girth=girth;
    }
    @Override
    public double calculate_volume() {
        double temp=(girth/4) * 0.0833333;
        double result=Math.pow(temp,2) * getLength();
        return result;
    }
}
