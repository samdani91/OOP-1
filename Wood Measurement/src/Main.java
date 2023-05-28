public class Main {
    public static void main(String[] args) {
        Roundwood one=new Roundwood(4.0,1);
        System.out.println("Volume of Round Wood:"+one.calculate_volume());

        Sawwood two=new Sawwood(1,1,1);
        System.out.println("Volume of Saw wood:"+two.calculate_volume());
    }
}