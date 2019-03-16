package ac.za.cput.isp;

public class Plane implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void sail() {

    }

    @Override
    public void fly() {
        System.out.println("Taking off...");
    }
}
