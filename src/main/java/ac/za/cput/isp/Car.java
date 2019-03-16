package ac.za.cput.isp;

public class Car implements Transport {
    @Override
    public void drive() {
        System.out.println("Beep beep");
    }

    @Override
    public void sail() {

    }

    @Override
    public void fly() {

    }
}
