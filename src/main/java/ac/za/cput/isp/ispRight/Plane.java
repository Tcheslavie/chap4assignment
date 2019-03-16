package ac.za.cput.isp.ispRight;

public class Plane implements FlyingTransport {
    @Override
    public void fly() {
        System.out.println("Taking off...");
    }
}
